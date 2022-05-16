//Desafios Matemáticos em Kotlin
//1 / 3 - Análise de Números
fun main(args: Array<String>) {

    var inteiros = mutableListOf<Int>()
    var pares = mutableListOf<Int>()
    var impares = mutableListOf<Int>()
    var positivos = mutableListOf<Int>()
    var negativos = mutableListOf<Int>()

    //TODO Continue declarando as variáveis.

    for (i in 1..5) {

        //print("${i}) QUAL SEU NUMERO? ")

        inteiros.add(readLine()!!.toInt())
    }
    for (k in inteiros) {
        //TODO Crie as condições necessárias.
        if((k%2)==0){pares.add(k)}
        if((k%2)!=0) { impares.add(k) }
        if(k>0) { positivos.add(k) }
        if(k<0) { negativos.add(k) }
    }

    //TODO Imprima os valores adequadamente.
    println("${pares.size} par(es)")
    println("${impares.size} impar(es)")
    println("${positivos.size} positivo(s)")
    println("${negativos.size} negativo(s)")

}