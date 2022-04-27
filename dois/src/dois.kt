fun main(){
    println("Nome: ")
    val nome = readln()

    dois(nome)
    dois("Alice")
    dois("José")
    dois()
}
//fun dois() = dois("voce") outra forma de por um parametro por defeito
fun dois (nome : String = "voce" ){

    println("Um para  $nome, um para mim." )

}
