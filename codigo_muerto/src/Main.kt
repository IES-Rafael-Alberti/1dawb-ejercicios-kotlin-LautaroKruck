import kotlin.math.sqrt

fun mediaGeometricaConCodigoExtra(numeros: List<Double>): Double {
   if (numeros.isEmpty()) {
      return 0.0
    }


   var productoAuxiliar = 1.0
   numeros.filter { it > 0 }.forEach { productoAuxiliar *= it }


    var producto = 1.0
    numeros.forEach { numero ->
        if (numero > 0) {
            producto *= numero
        }
    }
    val mediaGeometrica = sqrt(producto)


    val todosPositivos = numeros.all { it > 0 }
    if (todosPositivos && productoAuxiliar == producto) {
       println("Todos los números son positivos y el producto auxiliar es mayor.")
    }

    return mediaGeometrica
}

