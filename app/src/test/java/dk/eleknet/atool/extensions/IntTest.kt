package dk.eleknet.atool.extensions

import junit.framework.TestCase
import org.junit.Test

class IntTest {

    @Test
    fun intTest_orValueReturnsObjectValue() {
        val value: Int? = 3
        val result = value.orValue(4)
        TestCase.assertEquals("Unexpected int value", 3, result)
    }

    @Test
    fun intTest_orValueReturnsSuppliedValue() {
        val value: Int? = null
        val result = value.orValue(5)
        TestCase.assertEquals("Unexpected int value", 5, result)
    }
}