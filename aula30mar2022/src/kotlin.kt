fun main() {
    println("---Retangulo---")

    val largura = leInteiroPositivo("largura: ")
    val altura = leInteiroPositivo("altura: ")
    val r = Retangulo(largura,altura)


    println("Area do Retangulo = ${r.area()}")
    println("Perimetro do Retangulo = ${r.perimetro()}")
}

private fun leInteiroPositivo(nomeValorLer: String): Int {
    var valor: Int?
    do {
        println("$nomeValorLer ")
        valor = readln().toIntOrNull()

        if (valor == null) {
            println("Valor de $nomeValorLer invalido")
        }else if(valor <= 0){
            println("Valor tem que ser maior que 0")
        }
    } while (valor == null || valor <= 0)
    return valor
}

