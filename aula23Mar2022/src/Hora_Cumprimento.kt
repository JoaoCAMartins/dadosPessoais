fun main(args: Array<String>){
   // println("Nº Argumentos = ${args.count()}")
   // println(args[0])
   // println(args[1])
   // println(args[2])
   //println("Introduza uma hora de 0 - 23")
   //var hora = readln().toIntOrNull()
   //if(hora == null || hora<0 ||hora >23) println("Hora invalida")
   //
   //var cumprimentoHora = when(hora){
   //    in 0..4  -> "Boa Noite"
   //    in  5..12 -> "Bom Dia"
   //    in 12..20 ->"Boa Tarde"
   //    in 20..23 -> "Boa Noite"
   //    else -> "Adeus"
   //
   //}
   //println(cumprimentoHora)

     var hora : Int?

     if (args.count() > 0){
         hora = args[0].toIntOrNull()
     }
}