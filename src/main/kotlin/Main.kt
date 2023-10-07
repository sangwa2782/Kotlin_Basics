import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.hypot

//Simple calculation on two integer numbers in Kotlin

fun main() {
    var read = Scanner(System.`in`)

    print("Enter First number: ")
    var first = read.nextInt()

    print("Enter Second number: ")
    var second = read.nextInt()

    print("Enter any action('+','-','*','/'): ")
    var choice = read.next()[0]

    when(choice) {
        '+' -> println("Sum of $first and $second is ${first+second}")
        '-' -> println("Subtraction of $first and $second is ${first-second}")
        '*' -> println("Multiplication of $first and $second is ${first*second}")
        '/' -> println("Division of $first and $second is ${first/second}")
        else -> println("not a valid operator")
    }



}


//fun factorial(first:Int):Long {
//    var fact: Long =1
//    for (i in 1..first) {
//         fact *= i.toLong()
//        return fact
//    }
//}
