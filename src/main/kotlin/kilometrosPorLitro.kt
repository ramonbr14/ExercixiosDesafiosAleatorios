
fun main() {
    var x: Int = readLine()!!.toInt()
    println("")
    var y: Double = readLine()!!.toDouble()
    var media: Double
    if ((x <= 0.0) || (y <= 0.0)) {
        println(String.format("0.000 km/l",y))
   } else {
        media = x/y
        println(String.format("%.3f km/l", media))
    }
}/*


fun main() {
    try{
        var x: String = readLine()!!.toString()
        var y: String = readLine()!!.toString()
        var media = 0.0
        if ((x.toInt() <= 0) || (y.toDouble() <= 0.0)) {
            println(String.format("0.000 km/l"))
        } else {
            media = (x.toInt() / y.toDouble())
            println(String.format("%.3f km/l", media))
        }
    }catch (e: Exception){
        print("Erro na aplicacao ")
    }

}

import java.util.Scanner

fun main(args: Array<String>) {
    var leitor = Scanner(System.`in`)
    val x: Int = leitor.nextInt()
    leitor = Scanner(System.`in`)
    val y: Double = leitor.nextDouble()
    val media: Double
    if((x<=0)||(y<=0)){
        println(String.format("0.000 km/l"))
    }else{
        media = x/y
        println(String.format("%.3f km/l", media))
    }
}*/