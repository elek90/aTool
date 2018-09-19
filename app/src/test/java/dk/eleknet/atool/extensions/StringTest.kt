package dk.eleknet.atool.extensions

import junit.framework.TestCase
import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.Test

class StringTest {

    @Test
    fun stringTest_orValueReturnsObjectValue() {
        val value: String? = "MyString"
        val result = value.orValue("ValueString")
        TestCase.assertEquals("Unexpected string value", "MyString", result)
    }

    @Test
    fun stringTest_orValueReturnsSuppliedValue() {
        val value: String? = null
        val result = value.orValue("NewString")
        TestCase.assertEquals("Unexpected string value", "NewString", result)
    }

    @Test
    fun stringTest_isValidEmail() {
        val validEmails = listOf(
            "email@valid.com",
            "my.email@domain.com",
            "123.33.mail@email.dk"
        )

        validEmails.forEach { email: String ->
            assertTrue("Valid email marked invalid: $email", email.isEmail())
        }
    }

    @Test
    fun stringTest_isInvalidEmail() {
        val invalidEmails = listOf(
            "@gmail.com", // missing mail
            "emailvalid.com", // missing @
            "my.email@.com", // missing domain
            "123.33.mail@email" // missing tld
        )

        invalidEmails.forEach { email: String ->
            assertFalse("Invalid email marked valid: $email", email.isEmail())
        }
    }
}