package me.felipesantos

fun main(){

    //listas

    //imutavel
    var list = listOf<Int>(1,2,3,4,6,7)
    println(list)
    //list[0] = 1

    //mutavel
    var list_m = mutableListOf<Int>(1,2,3,4,5,6,7)
    println(list_m)
    list_m[0] = 1000
    list_m.add(list_m.size, 10)
    println(list_m)

    //lambdas



}