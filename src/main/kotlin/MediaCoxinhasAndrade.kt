
fun main(args: Array<String>) {
    val leitor: String = readLine()!!.toString()
    //println("LEITOR VALOR: " + leitor)
    var espaco = " "
    var n1: String = ""
    var n2: String = ""
   // println("VARIAVEIS LINHA 8")
    var p = leitor.indexOf(" ")
    //println(" valor de p: ${p}")
    var x:  Int = 0
    for(i in leitor){
     //   println(" valor de x em 13: ${x}")
        x = leitor.indexOf(i,x)
        if(leitor.indexOf(i,x)<p){
      //      println(" valor de x em 15: ${leitor.indexOf(i,x)}")
            n1 += i
     //       println(" valor de n1: ${n1}")
        }
        else if(leitor.indexOf(i,x)>p){
      //      println(" valor de x em 20: ${leitor.indexOf(i,x)}")
            n2 += i
      //      println(" valor de n2: ${n2}")
        }

    }
    val H: Int = n1.toInt();
    val P: Int = n2.toInt();
 //  println(" valor de H: ${H}")
 //  println(" valor de P: ${P}")
   val media: Double = H/P.toDouble()
   println(String.format("%.2f", media))
    }



private operator fun <T> Comparable<T>.get(i: Char) {

}
