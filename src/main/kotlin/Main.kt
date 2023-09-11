import java.util.ArrayList
import java.util.Objects
import java.util.Scanner
import kotlin.math.pow




//1:- Program to find sum and average of array elements in Kotlin



fun main(args: Array<String>) {

    val s = Scanner(System.`in`)
    print("Enter number of elements in the array: ")

    val size = s.nextInt()

    val doubleArray = DoubleArray(size)

    println("Enter Arrays Element: ")
    for (i in doubleArray.indices) {
        print("doubleArray[$i] : ")
        doubleArray[i] = s.nextDouble()
    }

    var sum: Double = 0.toDouble()

    for (i in doubleArray.indices) {
        sum += doubleArray[i]
    }

    var avg = sum/doubleArray.size

    println("Array : ${doubleArray.contentToString()}")
    println("Sum of Element : $sum")
    println("Average of Element : $avg")


}







