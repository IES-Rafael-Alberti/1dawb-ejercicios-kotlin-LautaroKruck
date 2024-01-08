package calculadora_test

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CalculatorTest {

    @Test
    fun add() {

            assertEquals(4.0, Calculator.add(2.0, 2.0))

    }

    @Test
    fun multiply() {
        assertEquals(6.0, Calculator.multiply(3.0, 2.0))
    }

    @Test
    fun resta() {
        assertEquals(2.0, Calculator.resta(4.0, 2.0))
    }
}