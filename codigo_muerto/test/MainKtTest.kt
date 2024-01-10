import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MainKtTest {

    @Test
    fun mediaGeometricaConCodigoExtra() {
        val numeros = listOf(1.2, 3.4, 5.6)
        assertEquals(4.77995815881269,mediaGeometricaConCodigoExtra( listOf(1.2, 3.4, 5.6)))
        assertEquals(0.0,mediaGeometricaConCodigoExtra(emptyList()))
    }

}
