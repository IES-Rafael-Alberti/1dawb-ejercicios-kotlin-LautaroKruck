package comprobadorDni

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MainKtTest {

    @Test
    fun comprobarDni() {
        assertEquals(6, comprobarDni("1234567A"))
        assertEquals(7, comprobarDni("123456789A"))
        assertEquals(8, comprobarDni("AB345678A"))
        assertEquals(9, comprobarDni("123456789"))
        assertEquals(5, comprobarDni("12345678A"))
    }
}