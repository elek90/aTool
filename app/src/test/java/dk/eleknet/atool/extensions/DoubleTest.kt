package dk.eleknet.atool.extensions

import dk.eleknet.atool.extensions.orValue
import junit.framework.TestCase
import org.junit.Test

class DoubleTest {

    @Test
    fun doubleTest_orValueReturnsObjectValue() {
        val value: Double? = 1.0
        val result = value.orValue(2.0)
        TestCase.assertEquals("Unexpected double value", 1.0, result)
    }

    @Test
    fun doubleTest_orValueReturnsSuppliedValue() {
        val value: Double? = null
        val result = value.orValue(5.0)
        TestCase.assertEquals("Unexpected double value", 5.0, result)
    }
}