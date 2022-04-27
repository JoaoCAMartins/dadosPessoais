fun main(){
   cumprimentaPessoa ("João", "Olá")
    cumprimentaPessoa("Maria", "Bom dia")
    cumprimentaPessoa(nome = "Pedro")
    cumprimentaPessoa(cumprimento= "Boa tarde", nome = "Ana")
}
fun  cumprimentaPessoa(nome : String, cumprimento : String = "Olá")
    =println("$cumprimento $nome ")