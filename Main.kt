import java.math.BigDecimal

fun main() {

    // As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01

    var saque: BigDecimal = readLine()!!.toBigDecimal()

    var notas = arrayOf(0,0,0,0,0,0)
    var moedas = arrayOf(0,0,0,0,0,0)

    val cemreais:BigDecimal = 100.toBigDecimal()
    val cinquentareais: BigDecimal = 50.toBigDecimal()
    val vintereais: BigDecimal = 20.toBigDecimal()
    val dezreais: BigDecimal = 10.toBigDecimal()
    val cincoreais: BigDecimal = 5.toBigDecimal()
    val doisreais: BigDecimal = 2.toBigDecimal()

    val umreal: BigDecimal = 1.toBigDecimal()
    val cinquentacentavos: BigDecimal = 0.5.toBigDecimal()
    val vintecincocentavos: BigDecimal = 0.25.toBigDecimal()
    val dezcentavos: BigDecimal = 0.10.toBigDecimal()
    val cincocentavos: BigDecimal = 0.05.toBigDecimal()
    val umcentavo: BigDecimal = 0.01.toBigDecimal()

    while (saque>=cemreais){
        notas[0] = notas[0]+1
        saque -= cemreais
    }
    while (saque>=cinquentareais){
        notas[1] = notas[1] +1
        saque -= cinquentareais
    }
    while (saque>=vintereais){
        notas[2] = notas[2]+1
        saque -= vintereais
    }
    while (saque>=dezreais){
        notas[3] = notas[3]+1
        saque -=dezreais
    }
    while (saque>=cincoreais){
        notas[4] = notas[4]+1
        saque -=cincoreais
    }
    while (saque>=doisreais){
        notas[5] = notas[5]+1
        saque -=doisreais
    }
    while (saque>=umreal){
        moedas[0] = moedas[0]+1
        saque -=umreal
    }
    while (saque>=cinquentacentavos){
        moedas[1] = moedas[1]+1
        saque -=cinquentacentavos
    }
    while (saque>=vintecincocentavos){
        moedas[2] = moedas[2]+1
        saque -=vintecincocentavos
    }
    while (saque>=dezcentavos){
        moedas[3] = moedas[3]+1
        saque -=dezcentavos
    }
    while (saque>=cincocentavos){
        moedas[4] = moedas[4]+1
        saque -=cincocentavos
    }
    while (saque>=umcentavo){
        moedas[5] = moedas[5]+1
        saque -=umcentavo
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
