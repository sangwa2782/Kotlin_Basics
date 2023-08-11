fun main(args: Array<String>) {
    //funtion using method overloading
    println(addition(5,6))
    println(addition(5.0,6.0))
}


fun addition(x:Int, y:Int):Int
{
    return x+y
}

fun addition(x:Double, y:Double):Double
{
    return x+y
}