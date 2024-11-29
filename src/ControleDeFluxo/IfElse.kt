package ControleDeFluxo

import java.util.Scanner

fun main() {
  exemploSimpes()
}

fun exemploSimpes(){
    val tamanho: Float = 1.69f

    if (tamanho < 1.70){
        println("Altura minima permitida é 1.70m")
    }else{
        println("Altura permitida")
    }
}

fun idade(){
    val idade = 18

    if (idade < 18 ){
        println("Menor de Idade")
    }else if (idade >= 18){
        println("Maior de Idade")
    }
}

fun controleEntrada(){
    val scanner = Scanner(System.`in`)
    //xl - pista
    //xt - vip
    //xx - camarote

    println("Qual a idade")
    val idade = scanner.nextInt()

    println("Qual o tipo de ingresso?")
    println("1 - XL")
    println("2 - XT")
    println("3 - XX")
    val tipoIngresso = scanner.nextInt()

    if (idade >= 18 && tipoIngresso == 1){
        println("Entrada liberada - Pista")
    }else if (idade >= 18 && tipoIngresso == 2){
        println("Entrada Liberada - Vip")
    }else if (idade >= 18 && tipoIngresso == 3){
        println("Entrada Liberada - Camarote")
    }else{
        if (idade < 18){
            println("Está com responsável?")
            println("1 - Sim")
            println("2 - Não")
            val acompanhada = scanner.nextInt()
            if (acompanhada == 1 && tipoIngresso == 1){
                println("Entrada liberada - Pista")
            }else if (acompanhada == 1 && tipoIngresso == 2){
                println("Entrada Liberada - VIP")
            }else if (acompanhada ==1 && tipoIngresso ==3){
                println("Entrada Liberada - Camarote")
            }else{
                println("Não é permitido entrada de menor sem responsável")
            }
        }
    }
}