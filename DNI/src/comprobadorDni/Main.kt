package comprobadorDni

fun comprobarDni(dni: String): Int {
    val patronNumeros = """^\d{8}""".toRegex()
    val patronLetra = """[A-Za-z]""".toRegex()
    var clase = 5

    if (dni.length < 9) {
        clase = 6

    } else if (dni.length > 9) {
        clase = 7

    } else if (!dni.substring(0,8).matches(patronNumeros)) {
        clase = 8

    } else if (!dni.substring(8,9).matches(patronLetra)) {
        clase = 9
    }
    return clase
}