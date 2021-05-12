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

    println(resultado.toString())


    //atribuição kotlin way
    var numero = 10
    var saida: String

    saida = if(numero % 2 == 0){
        "$numero é par"
    }
    else {
        "$numero é impar"
    }
    
    println(saida)

    //when
    val idade = 10

    val result = when{
        idade < 10 -> "criança"
        idade < 30 -> "adulto"
        else -> "idoso"
    }

    println(result)

    //laços

    // de um numero a outro
    //for(i in 0 until 10)
    //for(i in 1..10)

    //de um numero a outro com passo personalizado , ex 2 em 2
    for(i in 1..10 step 2) {
        println(i)
    }

    //decrescente
    for(i in 10 downTo 1){
        println(i)
    }

    // percorrendo array
    var lista = arrayOf("one", "two", "three")
    for(element in lista){
        println(element)
    }

    //pegando elemento e index do array
    for((index, element) in lista.withIndex()){
        println("lista[" + index + "] = " + element)
    }

    //percorrer usando forEach
    lista.forEach { println(it) }

    //while
    var loop = 0

    while(loop < 10) {
        println(loop)
        loop++
    }

    println(somar(10,5))
    printSum(5, 6)
    println(som(5, 8))
    println(somaN(1,2,3,4,5,6,7))

    //classes
    var person = Person("Felipe", 21)
    println(person)
}

//funcao que soma 2 inteiros e retorna um inteiro
//com retorno
fun somar(a: Int, b: Int):Int{
    return a + b
}
//sem retorno
fun printSum(a: Int, b: Int){
    println(a + b)
}
//sem corpo
fun som(a: Int, b: Int) = a * b

//com parametros variaveis
fun somaN(vararg numbers: Int):Float{
    if(numbers.isNotEmpty()){
        val total_sum = numbers.sum()
        return total_sum.toFloat()
    }
    return 0f
}

