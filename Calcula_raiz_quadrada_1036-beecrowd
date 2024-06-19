import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.math.sqrt

fun main() {
    // Não é possível calcular as raízes de uma equação de segundo grau nos seguintes casos:
    // Delta negativo:
    // Coeficiente A igual a zero:

    val linha: String = readLine()!!

    val parts = linha.split(" ")

    var A: BigDecimal = parts[0].toBigDecimal()
    var B: BigDecimal = parts[1].toBigDecimal()
    var C: BigDecimal = parts[2].toBigDecimal()

    val delta: BigDecimal
    val zero: BigDecimal = 0.0.toBigDecimal()

    val r1: BigDecimal
    val r2: BigDecimal

    if (A == zero){
        println("Impossivel calcular")
    }else{
        delta = ((B*B)-4.toBigDecimal()*A*C)
        if (delta<zero){
            println("Impossivel calcular")
        }else{
            val raizdedelta: BigDecimal = sqrt(delta.toDouble()).toBigDecimal()
            val doisvezesa: BigDecimal = (2.toBigDecimal()*A)
            r1 = ((-B + raizdedelta)/doisvezesa).setScale(5, RoundingMode.HALF_EVEN)
            r2 = ((-B - raizdedelta)/doisvezesa).setScale(5, RoundingMode.HALF_EVEN)

            println("R1 = $r1")
            println("R2 = $r2")
        }
    }
}
