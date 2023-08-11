import kotlin.math.pow




// ABSTRACT
// * A class can't be instantiated
// * Abstract class can have both abstract and non abstract properties & method
// * If a class has abstract method or property then class must be declared as abstract

fun main(args: Array<String>) {
    val circle = Circles(4.0)
    println(circle.area())

    circle.display()

}

abstract class Shape{
    var name: String = ""
    abstract  fun area() : Double
    abstract  fun display()
}

class Circles(val radius:Double) : Shape(){
    override fun area(): Double = Math.PI * radius * radius
    override fun display() {
       println("Circle is getting displayed")
    }
}

