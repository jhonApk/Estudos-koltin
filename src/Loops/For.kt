package Loops

fun main() {
    ex01()
}


fun forBasico(){
    val contagem = 10
    for( i in 0..contagem){
        println(i)
    }
}

fun forDecrescente(){
    val count = 10

    for (i in count downTo 0){
        println(i)
    }

    for (i in 0..count step 2){
        print(i)
    }
}

fun ex01(){
    val lista = arrayOf(1,2,4,3,6)

    for (i in lista.indices){
        println(lista[i])
    }
}

