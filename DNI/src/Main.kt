fun main()
{
    val listaClases = mutableListOf<Int>()
    val dni = pedirDni(listaClases)
    val respuesta = obtenerRespuesta(dni, listaClases)

    println("Valores: ${dni.toUpperCase()}  $respuesta")
}

val ABECEDARIO = ('a'..'z').toList()

fun pedirDni(listaClases: MutableList<Int>): String
{
    print("Introduzca el DNI: ")
    return readLine()?.trim() ?: ""
}

fun validarDni(dni: String, listaClases: MutableList<Int>)
{
    if (dni.length < 9)
    {
        listaClases.add(6)
    } else if (dni.length > 9)
    {
        listaClases.add(7)
    } else
    {
        try
        {
            dni.substring(0, 7).toInt()
            if (dni[8].toLowerCase() !in ABECEDARIO) listaClases.add(9) else listaClases.add(5)
        } catch (e: NumberFormatException)
        {
            listaClases.add(8)
        }
    }
}

fun obtenerRespuesta(dni: String, listaClases: MutableList<Int>): String
{
    validarDni(dni, listaClases)

    return if (listaClases.isEmpty())
    {
        "Clases: $listaClases"
    } else
    {
        "Clases: $listaClases"
    }
}
