
fun ejer_1_4() {

    println("Escribe una temperatura en grados Celsius: ")

    var grados = readln().toFloat()
    grados = grados * 9 / 5 + 32
    println("Son $grados grados Fahrenheit")
}
//#Escribe un programa que pida el importe final de un artículo y calcule e imprima por pantalla el IVA que se ha pagado y el importe sin IVA (suponiendo que se ha aplicado un tipo de IVA del 10%).//
fun ejer_1_6() {

    println("Escribe el importe total de un artículo \n")

    val preciototal = readln().toFloat()
    val iva : Float = (preciototal * 0.21).toFloat()
    val psiniva : Float = preciototal - iva

    println("Su precio sin iva es de $psiniva y el iva es de $iva .")
}
//#Escribir un programa que pida al usuario su peso (en kg) y estatura (en metros), calcule el índice de masa corporal y lo almacene en una variable, y muestre por pantalla la frase Tu índice de masa corporal es donde es el índice de masa corporal calculado redondeado con dos decimales //
fun ejer_1_12() {
    println("Dame tu peso en kg: ")
    val peso = readln().toFloat()

    println("Dame tu estatura en metros: ")
    val altura = readln().toFloat()

    val mascor : Float = (peso / (altura * altura ))

    println("Tu índice de masa corporal es ${mascor%.2f}")
}


//Imagina que acabas de abrir una nueva cuenta de ahorros que te ofrece el 4% de interés al año. Estos ahorros debido a intereses, que no se cobran hasta finales de año, se te añaden al balance final de tu cuenta de ahorros. Escribir un programa que comience leyendo la cantidad de dinero depositada en la cuenta de ahorros, introducida por el usuario. Después el programa debe calcular y mostrar por pantalla la cantidad de ahorros tras el primer, segundo y tercer años. Redondear cada cantidad a dos decimales.//
//Calcula el interés: capital * (1 + interes)//
fun ejer_1_15() {
    println("Introduzca la cantidad de dinero: ")
    val dinero = readln().toInt()
    
    val interes1 = dinero * (1 + 0.04)
    println("Ahorros en el primer año: ${interes1%.2f} ")

    val interes2 = interes1 * (1 + 0.04)
    println("Ahorros en el segundo año: ${interes2%.2f} ")

    val interes3 = interes2 * (1 + 0.04)
    println("Ahorros en el tercer año: ${interes3%.2f} ")
}


//#Escribir un programa que pregunte el nombre completo del usuario en la consola y después muestre por pantalla el nombre completo del usuario tres veces, una con todas las letras minúsculas, otra con todas las letras mayúsculas y otra solo con la primera letra del nombre y de los apellidos en mayúscula. El usuario puede introducir su nombre combinando mayúsculas y minúsculas como quiera.//
fun ejer_1_18() {
    println("Introduzca su nombre: ")
    val palabra = readln()

    println(palabra.lowercase())
    println(palabra.uppercase())
}


fun ejer_1_20() {
    println("¿Va a introducir el número con prefijo? (S/N)")
    var prefijo: String
    do {
        println("**ERROR** ")
        println("Introduzca una opción válida. (S/N)")
        prefijo = readln() ?: ""
    } while (prefijo != "S" && prefijo != "N")

    println("Introduzca su número: ")
    var telefono = readln() ?: ""

    if (prefijo == "S") {
        telefono = telefono.replace("+34", "").replace("-", "")
        println(telefono[8])
    } else {
        println(telefono)
    }
}

fun ejer_1_21() {
    println("Introduce una frase:")
    val frase = readln() ?: ""

    val fraseInvertida = invertirFrase(frase)

    println("Frase invertida: $fraseInvertida")
}

fun invertirFrase(frase: String): String {
    return frase.reversed()
}

fun ejer_1_22() {
    println("Introduce una frase:")
    val frase = readln() ?: ""

    println("Introduce una vocal:")
    val vocal = readln() ?: ""

    if (vocal.length == 1 && vocal[0].toLowerCase() in "aeiou") {
        val fraseConVocalMayuscula = frase.replace(vocal.toLowerCase(), vocal.toUpperCase())
        println("Frase con la vocal en mayúscula: $fraseConVocalMayuscula")
    } else {
        println("Por favor, introduce una vocal válida.")
    }
}

fun ejer_1_24() {
    println("Introduce el precio del producto en euros con dos decimales:")
    val precio = readLine()?.toDoubleOrNull()

    if (precio != null) {
        val euros = precio.toInt()
        val centimos = ((precio - euros) * 100).toInt()

        println("Número de euros: $euros")
        println("Número de céntimos: $centimos")
    } else {
        println("Por favor, introduce un precio válido.")
    }
}

fun ejer_1_25() {
    println("Introduce tu fecha de nacimiento en formato dd/mm/aaaa:")
    val fechaNacimiento = readLine() ?: ""

    val partesFecha = fechaNacimiento.split("/")
    if (partesFecha.size == 3) {
        val dia = partesFecha[0]
        val mes = partesFecha[1]
        val anio = partesFecha[2]

        println("Día: $dia")
        println("Mes: $mes")
        println("Año: $anio")
    } else {
        println("Formato de fecha incorrecto. Introduce la fecha en formato dd/mm/aaaa.")
    }
}

fun ejer_1_26() {
    println("Introduce los productos de la cesta de la compra separados por comas:")
    val productos = readLine() ?: ""

    val listaProductos = productos.split(",")

    println("Productos en la cesta:")
    for (producto in listaProductos) {
        println(producto.trim()) // trim() elimina espacios en blanco alrededor del nombre del producto
    }
}

fun ejer_1_27(){

    println("Introduce el nombre del producto:")
    val nombreProducto = readln() ?: ""

    println("Introduce el precio del producto:")
    val precioProducto = readln()?.toDoubleOrNull() ?: 0.0

    println("Introduce el número de unidades:")
    val unidades = readln()?.toIntOrNull() ?: 0

    val costoTotal = precioProducto * unidades

    println("Nombre del producto: $nombreProducto")
    println("Precio unitario: ${"%.2f".format(precioProducto)}")
    println("Número de unidades: ${"%03d".format(unidades)}")
    println("Coste total: ${"%8.2f".format(costoTotal)}")
}

fun ejer_2_1_2() {
    // Almacenar la contraseña en una variable
    val conGuardada = "contraseña"

    // Solicitar al usuario que ingrese la contraseña
    print("Ingrese la contraseña: ")
    val conUsuario = readln()

    // Verificar si la contraseña introducida coincide (sin distinción entre mayúsculas y minúsculas)
    if (conUsuario.equals(conGuardada, ignoreCase = true)) {
        println("¡Contraseña correcta!")
    } else {
        println("Contraseña incorrecta.")
    }
}

fun ejer_2_1_3() {
    // Solicitar al usuario que ingrese dos números
    print("Ingrese el numerador: ")
    val numerador = readln()?.toDouble()

    print("Ingrese el divisor: ")
    val divisor = readln()?.toDouble()

    // Verificar si el divisor es cero
    if (divisor != 0.0) {
        // Realizar la división y mostrar el resultado
        val resultado = numerador?.div(divisor!!)
        println("Resultado de la división: $resultado")
    } else {
        // Mostrar un mensaje de error si el divisor es cero
        println("Error: No se puede dividir por cero.")
    }
}

fun ejer_2_1_6() {
    // Solicitar al usuario que ingrese su nombre
    print("Ingrese su nombre: ")
    val nombre = readln()

    // Solicitar al usuario que ingrese su sexo
    print("Ingrese su sexo (M/F): ")
    val sexo = readln()?.toUpperCase()

    // Verificar a qué grupo pertenece el usuario
    if (nombre != null && sexo == "M" || sexo == "F") {
        val grupo = determinarGrupo(nombre.toString(), sexo)
        println("Usted pertenece al Grupo $grupo.")
    } else {
        println("Entrada no válida.")
    }
}

fun determinarGrupo(nombre: String, sexo: String): Char {
    return if ((sexo == "M" && nombre.first().toUpperCase() < 'M') ||
        (sexo == "F" && nombre.first().toUpperCase() >= 'N')
    ) {
        'A'
    } else {
        'B'
    }
}

fun ejer_2_1_8() {
    // Solicitar al usuario que ingrese la puntuación del empleado
    print("Ingrese la puntuación del empleado (0.0, 0.4, 0.6 o más): ")
    val puntuacion = readln()?.toDouble()

    // Verificar la puntuación y determinar el nivel y la cantidad de dinero correspondiente
    if (puntuacion != null) {
        val nivel = determinarNivel(puntuacion)
        val cantidadDinero = calcularCantidadDinero(puntuacion)

        println("Nivel: $nivel")
        println("Cantidad de dinero: $cantidadDinero €")
    } else {
        println("Entrada no válida.")
    }
}

fun determinarNivel(puntuacion: Double): String {
    return when {
        puntuacion == 0.0 -> "Inaceptable"
        puntuacion == 0.4 -> "Aceptable"
        puntuacion >= 0.6 -> "Meritorio"
        else -> "Nivel no definido"
    }
}

fun calcularCantidadDinero(puntuacion: Double): Double {
    val salarioBase = 2400.0
    return salarioBase * puntuacion
}

fun ejer_2_3_2() {
    // Solicitar al usuario un número entero positivo
    print("Ingrese un número entero positivo: ")
    val numero = readln()?.toInt()

    // Verificar si el número es positivo
    if (numero != null && numero > 0) {
        // Mostrar los números impares hasta el número proporcionado
        val numerosImpares = obtenerNumerosImpares(numero)
        println("Números impares hasta $numero: ${numerosImpares.joinToString(", ")}")
    } else {
        println("Entrada no válida. Por favor, ingrese un número entero positivo.")
    }
}

fun obtenerNumerosImpares(numero: Int): List<Int> {
    return (1..numero step 2).toList()
}

fun ejer_2_3_3() {
    var numero: Int

    do {
        // Solicitar al usuario un número entero positivo
        print("Ingrese un número entero positivo: ")
        numero = readln()?.toInt() ?: 0

        // Verificar si el número es positivo
        if (numero <= 0) {
            println("Entrada no válida. Por favor, ingrese un número entero positivo.")
        }

    } while (numero <= 0)

    // Mostrar la cuenta atrás desde el número ingresado hasta cero
    val cuentaAtras = obtenerCuentaAtras(numero)
    println("Cuenta atrás desde $numero hasta 0: ${cuentaAtras.joinToString(", ")}")
}

fun obtenerCuentaAtras(numero: Int): List<Int> {
    return (numero downTo 0).toList()
}

fun ejer_2_3_4() {
    try {
        // Solicitar al usuario un número entero
        print("Ingrese un número entero: ")
        val numero = readln()?.toInt() ?: throw NumberFormatException("La entrada no es válida")

        // Mostrar el número ingresado
        println("Número ingresado: $numero")

    } catch (e: NumberFormatException) {
        println("La entrada no es correcta. Error: ${e.message}")
    }
}





