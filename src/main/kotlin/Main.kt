import kotlin.math.pow

fun main(args: Array<String>) {
    //kotlin Object oriented Programming

    val mustang = Car("Mustang", "Petrol", 100)
    val beetal = Car("Beetal", "Diesel", 1200)


    println(mustang.name)
    println(mustang.kmran)
    println(mustang.type)
    println("")

    println(beetal.name)
    println(beetal.type)
    println("")

    mustang.driveCar()
    beetal.driveCar()




}

class Car (val name: String, val type : String, var kmran : Int) //properties
{
    fun driveCar(){
        println("$name Car is driving")
    }

    fun applyBreakes(){
        println("Applied Breaks")
    }
}