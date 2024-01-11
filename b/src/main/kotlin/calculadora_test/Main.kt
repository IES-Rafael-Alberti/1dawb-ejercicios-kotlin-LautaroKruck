fun List<List>.filtrar (fn:(Int) -> Boolean): List<Int> {
    val listaFiltrada = MutableListOf<Int>()

    for (num in this) {

        if (fn(num)) {
            listaFiltrada.add(num)
        }
    }

    println(fn(this.size))

    return listaFiltrada.toList()
}

fun main () {

    val lista = listOf(33, 77, 0, -9, -12, 9)

    val listaPositivos = lista.filtrar {it > 0}
    println("La lista de números positivos es ${listaPositivos.joinToString(separator:", ")}")
    println("La lista de números positivos es ${lista.filter{it > 0}.joinToString(separator:", ")}")


    lista.filtrar { it > 0 }

}

fun main() {

    fun isAnEmail(s: (String) -> Boolean ){
        print("Introduzca un email:")
        if(s(readln())) {
            println("Ese coreo es de empresa. ")
        }
        else {
            println("Correo erróneo.")
        }
    }

    fun businessEmail(s: String):Boolean {
        return s.contains(other:"@") && s.contains(other:"business.com")

    }
    isAnEmail(::businessEmail)


}