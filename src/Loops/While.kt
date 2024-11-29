package Loops

import java.util.Scanner

fun main() {
    calculadora()
}

fun exemploWhile(){
    var count = 0

    while (count <= 10){
        println(count)
        count++
    }
}

fun calculadora(){
    val scanner = Scanner(System.`in`)
    println("Qual operação deseja fazer ")
    println("""
        1 - Soma
        2 - Subtração
        3 - Multiplicação
        4 - Divisão
        5 - Sair
    """.trimIndent())
    val opcaoOperacao = scanner.nextInt()

    while (opcaoOperacao == 1){
        println("Qual operação deseja fazer ")
        println("""
        1 - Soma
        2 - Subtração
        3 - Multiplicação
        4 - Divisão
        5 - Sair
    """.trimIndent())
        if (opcaoOperacao == 1){
            println("insira numero 1")
            val n1 = scanner.nextDouble()
            println("insira o numero 2")
            val n2 = scanner.nextDouble()
            println("A soma do $n1 + $n2 é: ${n1 + n2}")
            break
        }
    }

}