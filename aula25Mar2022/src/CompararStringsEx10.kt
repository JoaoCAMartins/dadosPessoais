fun main(){

        var s1 : String

        var s2 : String
        //Validaçao pela funçao
        //println("Introduza a primeira sequencia")
        //s1 = readln()
        //println("Introduza a segunda sequencia")
        //s2 = readln()

        //Validaçao fora da função
        //Sem o programa parar
      do {
          println("Introduza a primeira sequencia")
          s1 = readln()
          println("Introduza a segunda sequencia")
          s2 = readln()
          if (s1.length != s2.length){
              print("As sequencias sao diff")
          }
      }while(s1.length != s2.length)

        val distancia = hamming(s1, s2)
        println("Distancia de Hamming entre as sequencias é: $distancia")
        val distancia2 = hamming2(s1,s2)
    println("Distancia de Hamming entre as sequencias é: $distancia2")

}
fun hamming(a: String, b : String): Int{
    //Como é feito em java
   //if(a.length != b.length){
   //    throw java.lang.IllegalArgumentException("O tamanho das String tem que ser identico")
   //}
    // Como é feito em kotlin
    // require(a.length == b.length){
    //     "O tamanho das strings tem que ser identico"
    //  }
    var distancia  = 0

    for (i in 0 until a.length){
        if(a[i]!=b[i]){
            distancia++
        }
    }
    return distancia



}
fun hamming2(a: String, b:String): Int{
    //Validar em Kotlin
   //require(a.length == b.length){
   //    "O tamanho das strings tem que ser identico"
   //}
    return(0 until a.length).count{ a[it] != b[it] }
}
