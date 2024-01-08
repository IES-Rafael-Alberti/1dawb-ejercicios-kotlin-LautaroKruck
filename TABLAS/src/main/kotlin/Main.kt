fun main() {

    var tabla: Int

    do {

        limpiaConsola()
        mostrarMenuPpal()
        tabla = pedirtabla(1, 100)


    } while (tabla >= 1 and tabla <= 100)

}


fun mostrarMenuPpal() {
    println("Introduzca un número entre 1 y 100:")
}

fun tabla(){
    limpiaConsola()

    val allCards = Array(12, { i -> i + 1 })
    println("${allCards.first()} - ${allCards.last()}") // => 1 - 12


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

fun mensajeError(id: Int) {
    when (id) {
        1 -> println("**Error** Número no válido (pulse ENTER para continuar...)")
        else -> {
            println("**Error** Número no válido (pulse ENTER para continuar...)")
        }
    }
}

fun limpiaConsola() {
    for (i in 1..20) {
        println()
    }
}