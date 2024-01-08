package verificar_nif

import java.util.stream.DoubleStream

/* El desarrollador creará el enunciado de la aplicación y programará en kotlin la aplicación para verificar el nif.

En la aplicación, la persona usuaria debe introducir su nif, que debe ser una cadena de caracteres que debe de constar de 8 números y una letra.

Esta aplicación lo que debe mostrar si la cadena de caracteres es correcta, Sí lo es aparecerá la clase incluida válida.
Si no está correcta, depende de lo errónea que sea aparecerá una clase incluida no válida.

Este programa devolverá por pantalla el número 5 si la cadena de caracteres es correcta y cumple con las restricciones que tiene, ya que tiene una cadena de 8 números y una letra.
Si la cadena de caracteres está compuesta por menos de 9 caracteres, devolverá el número 6.
Por pantalla se devolverá el número 7 si la cadena de caracteres está compuesta por más de 9 caracteres.
En el caso de que alguno de los 8 primeros caracteres sea distinto de un número, por pantalla se devolverá el número 8.
Por último por pantalla devolverá el número 9 si el último carácter de la cadena no es una letra.

Por ejemplo, si el usuario introduce un nif como este: 12345678J, en este caso la clase incluida válida que devuelve es 5

 */
object Verificar_NIF {
    val ABECEDARIO = listOf(
        "a",
        "b",
        "c",
        "d",
        "e",
        "f",
        "g",
        "h",
        "i",
        "j",
        "k",
        "l",
        "m",
        "n",
        "o",
        "p",
        "q",
        "r",
        "s",
        "t",
        "u",
        "v",
        "w",
        "x",
        "y",
        "z"
    )

    fun pedirDNI(listaClases: MutableList<Int>): String
    {
        print("Introduzca el DNI: ")
        var dni = readln()?.trim() ?: ""

        if (dni.length < 9)
        {
            listaClases.add(6)
        }
        else if (dni.length > 9)
        {
            listaClases.add(7)
        }
        else
        {
            try
            {
                val dniNumber = dni.substring(0, 7).toInt()
                if (dni[8].lowercaseChar() is not in ABECEDARIO)
                {
                    listaClases.add(9)
                }
                else
                {
                    listaClases.add(5)
                }
            }
            catch (e: NumberFormatException)
            {
                listaClases.add(8)
            }
        }
        return dni

    }
}