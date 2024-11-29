package Basicos

fun main() {
    excecaoMensagem()
}

fun teste01(){
    throw IllegalArgumentException("error na autenticação")
}

fun excecaoMensagem(){
    val userInput = -1
    val cause = IllegalArgumentException("Causa Original: Estado ilegal")
    if (userInput < 0){
        throw IllegalArgumentException("Valor de entrada não pode ser negativo", cause)
    }
}

