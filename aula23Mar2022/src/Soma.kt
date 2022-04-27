fun main(){

    println("Introduza valor de a(Inteiro)")

    var a = readln().toIntOrNull()
    if(a ==null){

        a = 0
    }

    println("Introduza valor de b(Inteiro)")
    var b = readln().toIntOrNull()
    if (b== null){
        b = 0
    }

    val soma = a + b
    println("---Soma Inteiros---")
    println("$a + $b = $soma")

    //Em vez de if usar when
    println("Introduza um valor c  (real)")
    var c = readln().toDoubleOrNull()
    println("Introduza um valor d(real)")
    var d = readln().toDoubleOrNull()
    val soma2 =when{
          c == null && d== null -> 0.0
          c == null -> d
          d == null -> c
          else -> c + d
    }

    println("---Soma Real---")
    println("$c + $d = $soma2")

    //outra maneira de fazer
    println("Introduza um numero")
    val n1 = readln().toDoubleOrNull() ?: 0.0
    println("introduza outro numero")
    val n2 = readln().toDoubleOrNull() ?: 0.0

    val soma3 = n1 + n2
    println("$n1 + $n2 = $soma3")



}