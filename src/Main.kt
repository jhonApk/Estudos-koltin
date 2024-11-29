
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(){
    var soma = 0

    for (numero in 0 .. 10){
        if (numero % 2 == 0 ){
            soma = soma + numero
            println(soma)
        }

    }
}