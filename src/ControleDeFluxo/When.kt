package ControleDeFluxo

import java.util.*

fun main() {
    controleAcesso()
}

fun exemplo1(){
    val diaSemana = 1

    when(diaSemana){
        1 -> println("Segunda")
        2 -> println("terça")
        3-> println("Quarta")
        4 -> println("Quinta")
        5 -> println("Sexta")
        6 -> println("Sabado")
        7 -> println("Domingo")
        else -> println("Insira um numero correto")
    }
}

fun controleAcesso(){
    val scanner = Scanner(System.`in`)

    println("É maior de idade ? ")
    val idade = scanner.nextInt()

    println("Qual ingresso?")
    println("1 - XL (Pista)")
    println("2 - XX (Camarote) ?")
    val tipoIngresso = scanner.nextInt()

    when{
        idade >= 18 && tipoIngresso == 1-> println("Entrada Liberada - Pista")
        idade >= 18 && tipoIngresso == 2 -> println("Entrada Liberada - Camarote")
        idade < 18 -> {
            println("Está acompanhada pelo responsável?")
            println("1 - Sim")
            println("2 - Não")
            val acompanhada = scanner.nextInt()
            when{
                acompanhada == 1 && tipoIngresso == 1 -> println("Entrada liberada - Pista")
                acompanhada ==1  && tipoIngresso == 1 -> println("Entrada Liberada - Camarote")
                else -> println("Entrada negada")
            }
        }
    }
}