package me.felipesantos

fun main(){
    println("meu primeiro programa kotlin")

    //var = pode ser reasinada,alterada, mutavel
    //val = imutavel (nao pode ser instanciado vazio)

    val my_name_val = "felipe"
    var my_name_var = "santos"

    println(my_name_val + " " + my_name_var)

    //? na declaracao com tipo esperado define se a variavel pode ser nula
    val nao_nulo: String?
    nao_nulo = null

    //? para previnir null point exc
    println(nao_nulo?.length)

    // or de maneira classica
    val nulo = null
    if(nulo == null)
        println("vazio")
    else
        println(nulo)

    //or kotlin away
    val valor: String?
    valor = null

    println(valor?.length ?: "vazio")

    /*
    Estruturas de decisoes
     */

    var resultado: Boolean
    resultado = false

    if(1 > 2){
        resultado = true
    }
    else if (2 >= 3){
        resultado = true
    }
    else{
        resultado = false
    }

    println(resultado.toString())

}