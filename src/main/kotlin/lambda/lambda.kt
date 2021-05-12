package lambda

val addition: (Int, Int) -> Int = { a, b -> a + b}
val subtration = {a:Int, b:Int -> a - b}

fun calculate(a: Int, b:Int, calcFuntion: (Int, Int)-> Int): Int{
    return calcFuntion.invoke(a,b)
}



fun main(){

    println(addition(10, 20))
    println(subtration(20,10))
    println(calculate(10,20, addition))
    println(calculate(10, 20, ){a, b -> a * b })
}