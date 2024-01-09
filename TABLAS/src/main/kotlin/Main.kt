fun main() {
    do {
        val num = pedirNum(1, 100)
        val tabla = Array(10) { i -> (i + 1) * num }

        println("Tabla de multiplicar del $num:")
        for (i in 0 until tabla.size) {
            println("$num x ${i + 1} = ${tabla[i]}")
        }

    } while (pregunta("¿Desea generar otra tabla de multiplicación?"))
}
fun pedirtabla(min: Int, max: Int): Int {

    var tabla: Int
    var error = false

    do {
        print("Seleccione opción (0 = SALIR) >> ")
        tabla = try {
            readln().toInt()
        } catch (ex: NumberFormatException) {
            error = true
            -1
        }

        if (error || tabla !in min..max) {
            mensajeError(1)
            error = false
        }
    } while (tabla !in min..max)

    return tabla
}

fun limpiaConsola() {
    for (i in 1..20) {
        println()
    }
}
import java.util.*

fun pedirNum(min: Int, max: Int): Int {
    var num: Int
    val scanner = Scanner(System.`in`)
    while (true) {
        try {
            print("Introduce un número entre $min y $max: ")
            num = scanner.nextInt()
            if (num in min..max) {
                break
            } else {
                println("Número no válido. Debe estar en el rango especificado.")
            }
        } catch (e: InputMismatchException) {
            println("Error en entrada. Debes introducir un número entero.")
            scanner.nextLine() // Limpiar el buffer del scanner
        }
    }
    return num
}

fun pregunta(text: String): Boolean {
    val scanner = Scanner(System.`in`)
    while (true) {
        print("$text (s/n): ")
        val respuesta = scanner.next().toLowerCase()
        if (respuesta == "s") return true
        else if (respuesta == "n") return false
        else println("Error en respuesta. Debes contestar con 's' o 'n'.")
    }
}

