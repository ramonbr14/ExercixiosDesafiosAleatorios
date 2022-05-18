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


}
