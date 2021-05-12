package me.felipesantos

class Circle(private val radius: Double): Shape {
    override fun getArea(): Double{
        return 3.14 * radius * radius
    }

}

open class Rectangle(private val width: Double, private val height: Double): Shape{
    override fun getArea() = width * height
}

class square(val side: Double): Rectangle(side, side)