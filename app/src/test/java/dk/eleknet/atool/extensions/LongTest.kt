package dk.eleknet.atool.extensions

import junit.framework.TestCase.assertEquals
import org.junit.Test

class LongTest {

    @Test
    fun longTest_orValueReturnsObjectValue() {
        val value: Long? = 3
        val result = value.orValue(4)
        assertEquals("Unexpected int value", 3, result)
    }

    @Test
    fun longTest_orValueReturnsSuppliedValue() {
        val value: Long? = null
        val result = value.orValue(5)
        assertEquals("Unexpected int value", 5, result)
    }
}