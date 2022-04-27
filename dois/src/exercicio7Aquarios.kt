import kotlin.math.max

fun main(){
    println("Número de peixes?")
    var peixes = readln().toIntOrNull()


    if(peixes == null || peixes < 0){
        println("Numero de Peixes Invalido")
        return
    }

    println("Peixes : $peixes")
    var aquario = peixes / 30

    if(peixes % 30  != 0 ){
        aquario += 1
    }

    println("Numero de Aquarios : $aquario")




}