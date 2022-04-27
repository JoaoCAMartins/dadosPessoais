fun main(){
    print("Nome?")
    val nome =readln()


    when  (nome.length){
        0 -> dizOla("Anónimo")
        in 1..14->dizOla(nome)
        else -> dizOla(nome, "Olá")
    }

    val numCaractNome = nome.length

    if(numCaractNome == 0){
        dizOla("anónimo")
    }else if(numCaractNome<15){
        dizOla(nome)
    }else{
        dizOla(nome,"Olá")
    }
}

fun dizOla(nome: String, cumprimento : String ="Bom Dia"){
    println("$cumprimento $nome");

}


