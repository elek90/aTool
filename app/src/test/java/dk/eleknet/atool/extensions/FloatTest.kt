package dk.eleknet.atool.extensions

import junit.framework.TestCase
import org.junit.Test

class FloatTest {

    @Test
    fun floatTest_orValueReturnsObjectValue() {
        val value: Float? = 10f
        val result = value.orValue(20f)
        TestCase.assertEquals("Unexpected float value", 10f, result)
    }

    @Test
    fun floatTest_orValueReturnsSuppliedValue() {
        val value: Float? = null
        val result = value.orValue(3f)
        TestCase.assertEquals("Unexpected float value", 3f, result)
    }
}