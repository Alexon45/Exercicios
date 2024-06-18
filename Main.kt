import java.math.BigDecimal

fun main() {

   // As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01

    var saque: BigDecimal = readLine()!!.toBigDecimal()

    var notas = arrayOf(0,0,0,0,0,0)
    var moedas = arrayOf(0,0,0,0,0,0)

    while (saque>=100.00){
        notas[0] = notas[0]+1
        saque -= 100
    }
    while (saque>=50){
        notas[1] = notas[1] +1
        saque -= 50
    }
    while (saque>=20){
        notas[2] = notas[2]+1
        saque -= 20
    }
    while (saque>=10){
        notas[3] = notas[3]+1
        saque -=10
    }
    while (saque>=5){
        notas[4] = notas[4]+1
        saque -=5
    }
    while (saque>=2){
        notas[5] = notas[5]+1
        saque -=2
    }
    while (saque>=1){
        moedas[0] = moedas[0]+1
        saque -=1
    }
    while (saque>=0.5){
        moedas[1] = moedas[1]+1
        saque -=0.5
    }
    while (saque>=0.25){
        moedas[2] = moedas[2]+1
        saque -=0.25
    }
    while (saque>=0.10){
        moedas[3] = moedas[3]+1
        saque -=0.10
    }
    while (saque>=0.05){
        moedas[4] = moedas[4]+1
        saque -=0.05
    }
    while (saque>=0.01){
        moedas[5] = moedas[5]+1
        saque -=0.01
    }

    println("NOTAS")
    println("${notas[0]} nota(s) de R$ 100.00")
    println("${notas[1]} nota(s) de R$ 50.00")
    println("${notas[2]} nota(s) de R$ 20.00")
    println("${notas[3]} nota(s) de R$ 10.00")
    println("${notas[4]} nota(s) de R$ 5.00")
    println("${notas[5]} nota(s) de R$ 2.00")
    println("MOEDAS")
    println("${moedas[0]} moeda(s) de R$ 1.00")
    println("${moedas[1]} moeda(s) de R$ 0.50")
    println("${moedas[2]} moeda(s) de R$ 0.25")
    println("${moedas[3]} moeda(s) de R$ 0.10")
    println("${moedas[4]} moeda(s) de R$ 0.05")
    println("${moedas[5]} moeda(s) de R$ 0.01")




}


}
