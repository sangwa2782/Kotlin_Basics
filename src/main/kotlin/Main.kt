import kotlin.math.pow

fun main(args: Array<String>) {

    //funtion using hiegher order function

    var fn: (a:Double, b:Double)->Double=::addition
    println(fn (1.0,2.0))

    fn = ::power
    println(fn(2.0,3.0))

}


fun addition(x:Double, y:Double):Double
{
    return x+y
}

fun power(a:Double, b:Double):Double
{
    return a.pow(b)
}