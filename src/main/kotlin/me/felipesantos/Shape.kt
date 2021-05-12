package me.felipesantos

interface Shape {

    fun getArea(): Double

    fun printArea(){
        var formatArea = "%.2f".format(getArea())
        println(formatArea)
    }

}