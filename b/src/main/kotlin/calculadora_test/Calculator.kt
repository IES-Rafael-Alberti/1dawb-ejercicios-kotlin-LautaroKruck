package calculadora_test

import java.util.stream.DoubleStream

    object Calculator {
    fun add(vararg operands: Double): Double {

        if (operands.size==10) {
            println("igual a dos")
        }

        return DoubleStream.of(*operands)
            .sum()
    }

    fun resta(vararg operands: Double): Double {
        return DoubleStream.of(*operands)
            .reduce(1.0) { a: Double, b: Double -> a - b }
    }

    fun multiply(vararg operands: Double): Double {
        return DoubleStream.of(*operands)
            .reduce(1.0) { a: Double, b: Double -> a * b }
    }
}
