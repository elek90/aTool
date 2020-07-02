package dk.eleknet.atool.extensions

import junit.framework.TestCase
import org.junit.Test

class BooleanTest {

    @Test
    fun booleanTest_orValueReturnsObjectValue() {
        val value: Boolean? = true
        val result = value.orValue(false)
        TestCase.assertEquals("Unexpected boolean value", true, result)
    }

    @Test
    fun booleanTest_orValueReturnsSuppliedValue() {
        val value: Boolean? = null
        val result = value.orValue(true)
        TestCase.assertEquals("Unexpected boolean value", true, result)
    }
}