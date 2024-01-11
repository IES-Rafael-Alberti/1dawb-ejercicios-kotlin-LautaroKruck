3 -> {
    println("1. Listas 04")
    println("2. Listas 06")
    println("3. Diccionario 03")

    op = pedirOpcion(0, 3)
    when (op) {
        1 -> ejemplo2()
        2 -> ejemplo2()
        3 -> ejemplo2()

fun main() {
    var op: Int

    do {
        limpiaConsola()
        mostrarMenuPpal()
        op = pedirOpcion(0, 3)

        if (op != 0) {
            mostrarMenu(op)
        }

    } while (op != 0)
}

fun mostrarMenuPpal() {
    println("1. Ejercicios U1")
    println("2. Ejercicios U2")
    println("3. Ejercicios U3")
}

fun mostrarMenu(tipo: Int) {
    var op = -1

    do {
        limpiaConsola()
        when (tipo) {
            1 -> op = ejecutarSubMenu1()
            2 -> op = ejecutarSubMenu2()
            3 -> op = ejecutarSubMenu3()
        }
    } while (op != 0)
}

fun ejecutarSubMenu1(): Int {
    var op = -1

    do {
        limpiaConsola()
        println("1. Ejercicio 04")
        println("2. Ejercicio 06")
        println("3. Ejercicio 12")
        println("4. Ejercicio 15")
        println("5. Ejercicio 18")
        println("6. Ejercicio 20")
        println("7. Ejercicio 21")
        println("8. Ejercicio 22")
        println("9. Ejercicio 24")
        println("10. Ejercicio 25")
        println("11. Ejercicio 26")
        println("12. Ejercicio 27")

        op = pedirOpcion(0, 12)

        when (op) {
            1 -> ejer_1_4()
            2 -> ejer_1_6()
            3 -> ejer_1_12()
            4 -> ejer_1_15()
            5 -> ejer_1_18()
            6 -> ejer_1_20()
            7 -> ejer_1_21()
            8 -> ejer_1_22()
            9 -> ejer_1_24()
            10 -> ejer_1_25()
            11 -> ejer_1_26()
            12 -> ejer_1_27()
        }
        if (op != 0) {
            ejecutarEjercicio(op)
            limpiarYEsperar()
        }

    } while (op != 0)

    return op
}

fun ejecutarSubMenu2(): Int {
    var op = -1

    do {
        limpiaConsola()
        println("Submenú 2:")
        println("1. Sentencias condicionales")
        println("2. Sentencias iterativas")
        println("3. Captura de excepciones")
        println("0. Volver al menú principal")

        op = pedirOpcion(0, 3)

        if (op != 0) {
            mostrarSubMenu2(op)
        }

    } while (op != 0)

    return op
}

fun mostrarSubMenu2(subTipo: Int) {
    var op = -1

    when (subTipo) {
        1 -> {
            do {
                limpiaConsola()
                println("Sentencias condicionales:")
                println("1. EjCondicion 02")
                println("2. EjCondicion 03")
                println("3. EjCondicion 06")
                println("4. EjCondicion 08")
                println("0. Volver al submenú anterior")

                op = pedirOpcion(0, 4)
                when (op) {
                    1 -> ejer_2_1_2()
                    2 -> ejer_2_1_3()
                    3 -> ejer_2_1_6()
                    4 -> ejer_2_1_8()
                }

                if (op != 0) {
                    ejecutarEjercicio(op)
                    limpiarYEsperar()
                }
            } while (op != 0)
        }
        2 -> {
            do {
                limpiaConsola()
                println("Sentencias iterativas:")
                println("1. Ejercicio 02")
                // ... (otras opciones)
                println("0. Volver al submenú anterior")

                op = pedirOpcion(0, 10)

                if (op != 0) {
                    ejecutarEjercicio(op)
                    limpiarYEsperar()
                }
            } while (op != 0)
        }
        3 -> {
            do {
                limpiaConsola()
                println("Captura de excepciones:")
                println("1. Ejercicio 02")
                println("2. Ejercicio 03")
                println("3. Ejercicio 04")
                println("0. Volver al submenú anterior")

                op = pedirOpcion(0, 3)
                when (op) {
                    1 -> ejer_2_3_2()
                    2 -> ejer_2_3_3()
                    3 -> ejer_2_3_4()
                }

                if (op != 0) {
                    ejecutarEjercicio(op)
                    limpiarYEsperar()
                }
            } while (op != 0)
        }
    }
}

fun ejecutarSubMenu3(): Int {
    var op = -1

    do {
        limpiaConsola()
        println("Submenú 3:")
        println("1. Listas y tuplas")
        println("2. Diccionarios")
        println("3. Conjuntos")
        println("0. Volver al menú principal")

        op = pedirOpcion(0, 3)


        if (op != 0) {
            mostrarSubMenu3(op)
        }

    } while (op != 0)

    return op
}

fun mostrarSubMenu3(subTipo: Int) {
    var op = -1

    when (subTipo) {
        1 -> {
            do {
                limpiaConsola()
                println("Listas y tuplas:")
                println("1. Ejercicio 04")
                // ... (otras opciones)
                println("0. Volver al submenú anterior")

                op = pedirOpcion(0, 6)

                if (op != 0) {
                    ejecutarEjercicio(op)
                    limpiarYEsperar()
                }
            } while (op != 0)
        }
        2 -> {
            do {
                limpiaConsola()
                println("Diccionarios:")
                println("1. Ejercicio 03")
                // ... (otras opciones)
                println("0. Volver al submenú anterior")

                op = pedirOpcion(0, 7)

                if (op != 0) {
                    ejecutarEjercicio(op)
                    limpiarYEsperar()
                }
            } while (op != 0)
        }
        3 -> {
            do {
                limpiaConsola()
                println("Conjuntos:")
                println("1. Ejercicio 01")
                // ... (otras opciones)
                println("0. Volver al submenú anterior")

                op = pedirOpcion(0, 6)

                if (op != 0) {
                    ejecutarEjercicio(op)
                    limpiarYEsperar()
                }
            } while (op != 0)
        }
    }
}

fun limpiarYEsperar() {
    limpiaConsola()
    println("Presiona Enter para continuar...")
    readLine()
}

// ... (otras funciones)

fun pedirOpcion(min: Int, max: Int): Int {
    var opcion: Int
    var error = false

    do {
        print("Seleccione opción (0 = SALIR) >> ")
        opcion = try {
            readLine()!!.toInt()
        } catch (ex: NumberFormatException) {
            error = true
            -1
        }

        if (error || opcion !in min..max) {
            mensajeError(1)
            error = false
        }
    } while (opcion !in min..max)

    return opcion
}

fun mensajeError(id: Int) {
    when (id) {
        1 -> println("**Opción no válida**")
        else -> println("**Error desconocido**")
    }
}

fun limpiaConsola() {
    repeat(20) {
        println()
    }
}
