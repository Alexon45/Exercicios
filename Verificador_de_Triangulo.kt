import kotlin.math.pow

fun main() {

    val linha: String = readLine()!!
    val parts = linha.split(" ")

    val A1: Double = parts[0].toDouble()
    val B1: Double = parts[1].toDouble()
    val C1: Double = parts[2].toDouble()

    val A: Double
    val B: Double
    val C: Double

    if (A1 >= B1 && A1 >= C1){
        A = A1
        B = B1
        C = C1
    }else if (B1 >= A1 && B1 >= C1 ){
        A = B1
        B = A1
        C = C1
    }else{
        A = C1
        B = A1
        C = B1
    }

    if (A >= (B + C)){
        println("NAO FORMA TRIANGULO")
    }else if ( A.pow(2) == (B.pow(2)+C.pow(2))){
        println("TRIANGULO RETANGULO")
        if ( A == B && B == C){
            println("TRIANGULO EQUILATERO")
        }else if ( A == B || B == C || A == C){
            println("TRIANGULO ISOSCELES")
        }
    }else if (A.pow(2) > (B.pow(2)+C.pow(2))){
        println("TRIANGULO OBTUSANGULO")
        if ( A == B && B == C){
            println("TRIANGULO EQUILATERO")
        }else if ( A == B || B == C || A == C){
            println("TRIANGULO ISOSCELES")
        }
    }else if (A.pow(2) < (B.pow(2)+C.pow(2))){
        println("TRIANGULO ACUTANGULO")
        if ( A == B && B == C){
            println("TRIANGULO EQUILATERO")
        }else if ( A == B || B == C || A == C){
            println("TRIANGULO ISOSCELES")
        }
    }

}
