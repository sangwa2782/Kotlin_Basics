import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.hypot

//Program to input a string in Kotlin

fun main() {
//    var read = Scanner(System.`in`)

    println("Enter your name: ")
    val name = readln()

    println("Enter your name: ")
    val address = readln()

    println("Enter your name: ")
    val country = readln()

    println("Your name is : $name")
    println("Your Address is : $address")
    println("Your country name is : $country")

}


fun largestNum(a:Int, b:Int, c:Int):Int {
       return when {
            a>b && a>c -> a
            b>c -> b
            else -> c
        }
}
