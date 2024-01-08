
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
    println("¿Va a introducir el numero con prefijo?(S/N)")
    var prefijo: String
    do
        {
            println("**ERROR** ")
            println("Introduzca una opcion válida. (S/N)")
            prefijo = readln()
        }
    while((prefijo != "S") or (prefijo != "N"))

    println("Introduzca su numero: ")
    val telefono = readln()

    if (prefijo == "S")
        {
            telefono.replace("+34", "").replace("-", "")
            println(telefono[8])
        }
    else
        {
            println(telefono)
        }




}


