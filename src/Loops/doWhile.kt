package Loops

fun main() {
    //do-while execulta uma vez mesmo se a condição for falsa
    exemploDoWhile()
}

fun exemploDoWhile(){
    var count = 5

    do {
        println(count)
        count++
    }while (count == 0)
}