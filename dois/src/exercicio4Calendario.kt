import java.util.*

fun main(){
    val semana =   Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    val dia = Calendar.getInstance().get(Calendar.DAY_OF_MONTH)
    val ano = Calendar.getInstance().get(Calendar.YEAR)
    var mes = Calendar.getInstance().get(Calendar.MONTH)
    mes = mes + 1
    print("Hoje é dia : $dia")
    when(semana){
        1 -> print(" Domingo, ")
        2 -> print(" Segunda-Feira, ")
        3 -> print("Terça-Feira, ")
        4 -> print(" Quarta-Feira, ")
        5 -> print(" Quinta-Feira, ")
        6 -> print(" Sexta-Feira, ")
        7 -> print(" Sábado, ")
    }
    print(mes)
    print(" ")
    print(ano)



}