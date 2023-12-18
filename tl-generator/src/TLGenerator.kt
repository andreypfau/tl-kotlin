package io.github.andreypfau.tl.generator

import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import io.github.andreypfau.tl.parser.TLGrammar
import io.github.andreypfau.tl.parser.ast.*
import java.io.File

fun main(args: Array<String>) {
    val srcDir = File("/Users/andreypfau/IdeaProjects/tl-kotlin/examples/src/")
    generate(
        File("/Users/andreypfau/IdeaProjects/tl-kotlin/examples/resources/tl.tl"),
        "tl",
        srcDir
    )
    generate(
        File("/Users/andreypfau/IdeaProjects/tl-kotlin/examples/resources/telegram_api.tl"),
        "tl.telegram",
        srcDir
    )
    generate(
        File("/Users/andreypfau/IdeaProjects/tl-kotlin/examples/resources/td_api.tl"),
        "tl.td",
        srcDir
    )
    generate(
        File("/Users/andreypfau/IdeaProjects/tl-kotlin/examples/resources/secret_api.tl"),
        "tl.secret",
        srcDir
    )
    generate(
        File("/Users/andreypfau/IdeaProjects/tl-kotlin/examples/resources/mtproto_api.tl"),
        "tl.mtproto",
        srcDir
    )
    generate(
        File("/Users/andreypfau/IdeaProjects/tl-kotlin/examples/resources/tonlib_api.tl"),
        "tl.tonlib",
        srcDir
    )
    generate(
        File("/Users/andreypfau/IdeaProjects/tl-kotlin/examples/resources/ton_api.tl"),
        "tl.ton",
        srcDir
    )
    generate(
        File("/Users/andreypfau/IdeaProjects/tl-kotlin/examples/resources/lite_api.tl"),
        "tl.ton",
        srcDir
    )
}

fun generate(tlFile: File, rootPackage: String, outputDir: File) {
    val tlProgram = TLGrammar.parseOrThrow(tlFile.readText())
    val tlGenerator = TLGenerator(tlProgram, rootPackage, outputDir)
    tlGenerator.generate()
}

internal class TLGenerator(
    val tlProgram: TLProgram,
    val rootPackage: String,
    val file: File
) {
    init {
        file.parentFile.mkdirs()
    }

    private val typeMap = LinkedHashMap<BoxedTypeIdentifier, MutableList<CombinatorDeclaration>>()

    fun generate() {
        populateTypeMap()

        typeMap.forEach { (boxedTypeName, combinators) ->

            println("Generating $boxedTypeName")
            val resultTypeClassName = getResultTypeClassName(boxedTypeName)
            println(resultTypeClassName)
//            combinators.forEach {
//                println("    ${getCombinatorClassName(it)} | ${it.fullCombinatorName} | $it")
//            }

            val serializableAnnotation = AnnotationSpec.builder(ClassName("kotlinx.serialization", "Serializable"))
                .build()
            val jsonClassDiscriminatorAnnotation =
                AnnotationSpec.builder(ClassName("kotlinx.serialization.json", "JsonClassDiscriminator"))
                    .addMember("%S", "@type")
                    .build()

            val fileSpecBuilder = FileSpec.builder(resultTypeClassName).indent("    ")
            fileSpecBuilder.apply {
                if (combinators.size > 1) {
                    if (combinators.all { it.args.isEmpty() }) {
                        addType(TypeSpec.enumBuilder(resultTypeClassName).apply {
                            addAnnotation(serializableAnnotation)
                            addAnnotation(jsonClassDiscriminatorAnnotation)
                            combinators.forEach { combinator ->
                                val combinatorName = getCombinatorClassName(combinator)
                                val typeSpec = TypeSpec.anonymousClassBuilder().apply {
                                    addAnnotation(
                                        AnnotationSpec.builder(ClassName("kotlinx.serialization", "SerialName"))
                                            .addMember("%S", combinator.id.name)
                                            .build()
                                    )
                                    addAnnotation(
                                        getTlConstructorIdAnnotation(combinator)
                                    )
                                }.build()
                                addEnumConstant(combinatorName.simpleName.camelCaseToSnakeCase(), typeSpec)
                            }
                            addType(TypeSpec.companionObjectBuilder().build())
                        }.build())
                    } else {
                        addType(
                            TypeSpec.interfaceBuilder(resultTypeClassName)
                                .addAnnotation(serializableAnnotation)
                                .addAnnotation(jsonClassDiscriminatorAnnotation)
                                .addModifiers(KModifier.SEALED).apply {
                                    combinators.forEach { combinator ->
                                        addType(
                                            getTypeSpec(combinator).toBuilder().addSuperinterface(resultTypeClassName)
                                                .build()
                                        )
                                    }
                                }
                                .addType(TypeSpec.companionObjectBuilder().build())
                                .build()
                        )
                    }
                } else {
                    val combinator = combinators.first()
                    addType(getTypeSpec(combinator))
                }
            }
            fileSpecBuilder.addKotlinDefaultImports()
            fileSpecBuilder.addFileComment("This file is generated by TLGenerator.kt\nDo not edit manually!")
//            fileSpecBuilder.addAnnotation(
//                AnnotationSpec.builder(ClassName("kotlinx.serialization", "UseSerializers"))
//                    .addMember("%T::class", ClassName("io.github.andreypfau.tl.serialization", "Base64ByteStringSerializer"))
//                    .build()
//            )
            fileSpecBuilder.build().writeTo(file)
        }
    }

    fun getTlConstructorIdAnnotation(combinator: CombinatorDeclaration): AnnotationSpec {
        return AnnotationSpec.builder(ClassName("io.github.andreypfau.tl.serialization", "TLCombinatorId"))
            .addMember("0x%L", combinator.fullCombinatorName.hash.uppercase())
            .build()
    }

    fun getTypeSpec(combinator: CombinatorDeclaration): TypeSpec {
        val combinatorName = getCombinatorClassName(combinator)

        if (combinator.args.isEmpty()) {
            return TypeSpec.objectBuilder(combinatorName)
                .addAnnotation(ClassName("kotlinx.serialization", "Serializable"))
                .addAnnotation(
                    AnnotationSpec.builder(ClassName("kotlinx.serialization", "SerialName"))
                        .addMember("%S", combinator.id.name)
                        .build()
                )
                .addAnnotation(getTlConstructorIdAnnotation(combinator))
                .build()
        }

        return TypeSpec.classBuilder(combinatorName).apply {
            addModifiers(KModifier.DATA)
            addAnnotation(ClassName("kotlinx.serialization", "Serializable"))
            addAnnotation(
                AnnotationSpec.builder(ClassName("kotlinx.serialization", "SerialName"))
                    .addMember("%S", combinator.id.name)
                    .build()
            )
            addAnnotation(getTlConstructorIdAnnotation(combinator))
            addType(TypeSpec.companionObjectBuilder().build())
            primaryConstructor(
                FunSpec.constructorBuilder().apply {
                    combinator.args.forEach { argument ->
                        var typeName = getTypeName(argument.argType.expression)
                        if (argument.conditionalDef != null) {
                            typeName = typeName.copy(nullable = true)
                        }
                        addParameter(ParameterSpec.builder(getArgumentName(argument.id), typeName).apply {
                            if (argument.conditionalDef != null) {
                                defaultValue("null")
                            }
                        }.build())
                    }
                }.build()
            )
            combinator.args.forEach { argument ->
                val argumentName = getArgumentName(argument.id)
                val conditionalDef = argument.conditionalDef
                val argTypeExpression = argument.argType.expression
                val typeName = getTypeName(argTypeExpression).let {
                    if (conditionalDef != null) {
                        it.copy(nullable = true)
                    } else {
                        it
                    }
                }
                addProperty(
                    PropertySpec.builder(argumentName, typeName).apply {
                        initializer(argumentName)
                        if (argumentName != argument.id.name) {
                            addAnnotation(
                                AnnotationSpec.builder(ClassName("kotlinx.serialization", "SerialName"))
                                    .addMember("%S", argument.id.name)
                                    .build()
                            )
                        }
                        if (conditionalDef != null) {
                            val index = conditionalDef.nat
                            if (index != null) {
                                addAnnotation(
                                    AnnotationSpec.builder(
                                        ClassName(
                                            "io.github.andreypfau.tl.serialization",
                                            "TLConditional"
                                        )
                                    ).addMember("%S, %L", conditionalDef.id.name, index).build()
                                )
                            }
                        }
                        if (argTypeExpression is ETypeIdentifier) {
                            when (argTypeExpression.id.name) {
                                "int128" -> {
                                    addAnnotation(
                                        AnnotationSpec.builder(
                                            ClassName(
                                                "io.github.andreypfau.tl.serialization",
                                                "TLFixedSize"
                                            )
                                        ).addMember("value = %L", 16).build()
                                    )
                                }

                                "int256" -> {
                                    addAnnotation(
                                        AnnotationSpec.builder(
                                            ClassName(
                                                "io.github.andreypfau.tl.serialization",
                                                "TLFixedSize"
                                            )
                                        ).addMember("value = %L", 32).build()
                                    )
                                }
                            }
                        }
                        if (argTypeExpression is EMultiArg) {
                            val annotation = when (val e = argTypeExpression.multiplicity?.expression) {
                                is ETypeIdentifier -> AnnotationSpec.builder(
                                    ClassName(
                                        "io.github.andreypfau.tl.serialization",
                                        "TLFixedSize"
                                    )
                                ).addMember("field = %S", e.id.name).build()

                                is ENat -> AnnotationSpec.builder(
                                    ClassName(
                                        "io.github.andreypfau.tl.serialization",
                                        "TLFixedSize"
                                    )
                                ).addMember("value = %L", e.value).build()

                                else -> null
                            }
                            if (annotation != null) {
                                addAnnotation(annotation)
                            }
                        }
                        addAnnotation(
                            AnnotationSpec.builder(ClassName("kotlin.jvm", "JvmName"))
                                .useSiteTarget(AnnotationSpec.UseSiteTarget.GET)
                                .addMember("%S", argumentName)
                                .build()
                        )
                    }.build()
                )
            }
        }.build()
    }

    fun getArgumentName(optionalVariableIdentifier: OptionalVariableIdentifier): String {
        if (optionalVariableIdentifier is EmptyVariableIdentifier) {
            return "value"
        }
        return optionalVariableIdentifier.name.split("_").joinToString("") {
            it.replaceFirstChar { it.uppercaseChar() }
        }.replaceFirstChar { it.lowercaseChar() }
    }

    fun getCombinatorClassName(combinator: CombinatorDeclaration): ClassName {
        val superType = typeMap[combinator.resultType.id] ?: listOf()
        return if (superType.size > 1) {
            val superClassName = getResultTypeClassName(combinator.resultType.id)

            val names = superType.map { it.id.name.split(".", "_").dropLast(1).joinToString(".") }
            val subClassName =
                combinator.id.name.removePrefix(findCommonPrefix(names)).split(".", "_").joinToString("") {
                    it.replaceFirstChar { it.uppercaseChar() }
                }

            ClassName(superClassName.packageName, superClassName.simpleName, subClassName)
        } else {
            getResultTypeClassName(combinator.resultType.id)
        }
    }

    fun getResultTypeClassName(id: BoxedTypeIdentifier): ClassName {
        val packageName = rootPackage + id.name.lowercase().split(".", "_").dropLast(1).joinToString(".").let {
            if (it.isEmpty()) "" else ".$it"
        }
        return ClassName(
            packageName,
            id.name.split(".", "_").joinToString("") { it.replaceFirstChar { it.uppercaseChar() } })
    }

    fun getTypeName(expression: Expression): TypeName {
        return when (expression) {
            is EExpression -> {
                val subExpressions = expression.subExpressions.map { getTypeName(it) }
                if (subExpressions.size == 2) {
                    val (expr1, expr2) = subExpressions
//                    return (expr1 as ClassName).parameterizedBy(expr2.let {
//                        if (it is ClassName && it.canonicalName == "kotlinx.io.bytestring.ByteString") {
//                            it.copy()
//                        } else {
//                            it
//                        }
//                    })
                    return (expr1 as ClassName).parameterizedBy(expr2)
                }
                null
            }

            is EMultiArg ->
                List::class.asClassName()
                    .parameterizedBy(getTypeName(expression.subArgs.first().argType.expression)) // TODO: use fixed size List
            is ENat -> null
            is EBangOperator -> null
            is EPercentOperator -> null
            is EPlusOperator -> null
            is ETypeIdentifier -> {
                val id = expression.id
                when (id.name) {
                    "int", "int32", "Int32" -> Int::class.asClassName()
                    "#" -> Int::class.asClassName()
                    "long", "int53", "Int53", "Int64", "int64" -> Long::class.asClassName()
                    "double" -> Double::class.asClassName()
                    "string", "secureString" -> String::class.asClassName()
                    "Bool" -> Boolean::class.asClassName()
                    "vector" -> List::class.asClassName()
                    "Vector" -> List::class.asClassName() // TODO: boxed decode for Vector
                    "int128",
                    "int256",
                    "bytes",
                    "secureBytes",
                    "object",
                    "function" -> ClassName("kotlinx.io.bytestring", "ByteString").let {
                        it.copy(
                            annotations = it.annotations + AnnotationSpec.builder(
                                ClassName(
                                    "kotlinx.serialization",
                                    "Serializable"
                                )
                            )
                                .addMember(
                                    "%T::class",
                                    ClassName("io.github.andreypfau.tl.serialization", "Base64ByteStringSerializer")
                                )
                                .build()
                        )
                    }

                    "true" -> Unit::class.asClassName()
                    else -> {
                        typeMap.entries.forEach { (_, combinators) ->
                            val combinator = combinators.find {
                                it.id.name == id.name
                            }
                            if (combinator != null) {
                                return getCombinatorClassName(combinator)
                            }
                        }
                        if (id is BoxedTypeIdentifier) {
                            return getResultTypeClassName(id)
                        }
                        null
                    }
                }
            }
        } ?: throw IllegalStateException("Cannot get type name for expression: $expression")
    }

    private fun populateTypeMap() {
        tlProgram.constructors.declarations.forEach { decl ->
            when (decl) {
                is BuiltinCombinatorDeclaration -> {}
                is CombinatorDeclaration -> {
                    val id = decl.id.name
                    when (id) {
                        "bytes", "true", "boolTrue", "boolFalse", "vector", "int128", "int256", "int32", "int53", "int64", "secureBytes", "secureString" -> return@forEach
                    }
                    val typeCombinators = typeMap.getOrPut(decl.resultType.id) { ArrayList() }
                    typeCombinators.add(decl)
                }

                is EmptyDeclaration -> TODO()
                is FinalDeclaration -> TODO()
                is NewDeclaration -> TODO()
                is PartialCombinatorApplicationDeclaration -> TODO()
                is PartialTypeApplicationDeclaration -> TODO()
            }
        }
    }

    private fun StringBuilder.appendHeaderDisclaimer() {
        append(
            """
            //////////////////////////////////////////////
            // This file is generated by TLGenerator.kt //
            // Do not edit manually!                    //
            //////////////////////////////////////////////
            
        """.trimIndent()
        )
    }
}

fun String.camelCaseToSnakeCase(): String {
    return this.replace(Regex("([a-z])([A-Z])"), "$1_$2").uppercase()
}

fun findCommonPrefix(strings: List<String>): String {
    if (strings.isEmpty()) {
        return ""
    }

    // Sort the list of strings to make it easier to find the common prefix
    val sortedStrings = strings.sorted()

    // Take the first and last strings (after sorting) for comparison
    val firstString = sortedStrings.first()
    val lastString = sortedStrings.last()

    // Find the index where the common prefix ends
    val endIndex = minOf(firstString.length, lastString.length)
    var commonPrefixEndIndex = 0

    for (i in 0 until endIndex) {
        if (firstString[i] == lastString[i]) {
            commonPrefixEndIndex++
        } else {
            break
        }
    }

    // Extract the common prefix from the first string
    return firstString.substring(0, commonPrefixEndIndex)
}
