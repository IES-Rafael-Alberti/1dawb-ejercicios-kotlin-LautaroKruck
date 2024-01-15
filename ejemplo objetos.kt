
class Persona(nombre: String, altura: Double, peso: Int) {
    var nombre: String
    var altura: Double
    var peso: Int

    init {
        if (nombre.isEmpty()) {
            this.nombre = "Persona"
        }
        else {
            this.nombre = nombre
        }
    }
    init {
        if (altura.isEmpty()) {
            this.altura = 1.80
        }
        else {
            this.altura = altura
        }
    }
    init {
        if (peso.isEmpty()) {
            this.peso = 60
        }
        else {
            this.peso = peso
        }
    }



}
class Perro() {
    var nombre: String = ""
        get() = field
        set(value) {
            if (value.isEmpty()) {
                field = "Perro"
            }
            else {
                field = value
            }

        }

    init {
        if (this nombre )
    }
    var raza: String = ""
    var altura: Int = 0
    var edad: Int = 0

    fun mostrarDesc() {
        println()
    }
}

fun main() {
    val persona = Persona("Marta", 1.73 , 63)

    val miPerro = Perro("Dobby",  )
}