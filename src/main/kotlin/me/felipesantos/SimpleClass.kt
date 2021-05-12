package me.felipesantos

class SimpleClass {
    //class sem mimimi, padrão java
    var name: String? = null
    var age: Int? = null

    constructor(name: String, age: Int){
        this.age = age
        this.name = name
    }

}

fun main(){
    var human = SimpleClass("felipe", 21)
    println(human.name + human.age)

    human.name = "jose"
    human.age = human.age!! + 1
    println(human.name + human.age)
}