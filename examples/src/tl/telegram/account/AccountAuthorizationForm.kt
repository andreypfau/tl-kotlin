// This file is generated by TLGenerator.kt
// Do not edit manually!
package tl.telegram.account

import io.github.andreypfau.tl.serialization.TLCombinatorId
import io.github.andreypfau.tl.serialization.TLConditional
import kotlin.jvm.JvmName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import tl.telegram.SecureRequiredType
import tl.telegram.SecureValue
import tl.telegram.SecureValueError
import tl.telegram.User

@Serializable
@SerialName("account.authorizationForm")
@TLCombinatorId(0xAD2E1CD8)
public data class AccountAuthorizationForm(
    @get:JvmName("flags")
    public val flags: Int,
    @SerialName("required_types")
    @get:JvmName("requiredTypes")
    public val requiredTypes: List<SecureRequiredType>,
    @get:JvmName("values")
    public val values: List<SecureValue>,
    @get:JvmName("errors")
    public val errors: List<SecureValueError>,
    @get:JvmName("users")
    public val users: List<User>,
    @SerialName("privacy_policy_url")
    @TLConditional("flags", 0)
    @get:JvmName("privacyPolicyUrl")
    public val privacyPolicyUrl: String? = null,
) {
    public companion object
}
