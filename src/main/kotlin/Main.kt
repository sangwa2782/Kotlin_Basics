import kotlin.math.pow

fun main(args: Array<String>) {
// METHOD polymorphism and inheritance

    val circle : Shape = Circle(4.0)
    val square : Shape = Square(6.0)

    val shapes = arrayOf(Circle(4.0), Square(4.0), Triangle(3.0, 4.0))
    printArea(shapes)
}

fun printArea(shapes: Array<Shape>){
    for (shape in shapes){
        println(shape.area())
    }
}

open class Shape{
    open fun area() : Double = 0.0
}

class Circle(val radius:Double):Shape(){
    override fun area(): Double = Math.PI * radius * radius
}

class  Square(val side:Double) : Shape() {
    override fun area(): Double = side * side
}

class Triangle(val base:Double, val height:Double) : Shape() {
    override fun area(): Double = 0.5 * base * height
}