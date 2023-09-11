import java.util.ArrayList
import java.util.Objects
import java.util.Scanner
import kotlin.math.pow




//1:- Kotlin program to concatenate two integer arrays



fun main(args: Array<String>) {

   val s = Scanner(System.`in`)

    println("Enter the length of Element in array1: ")
    var size = s.nextInt()

    val intArray1 = IntArray(size)

    println("Enter Array Element: ")
    for (i in intArray1.indices){
        print("intArray1[$i] : ")
        intArray1[i] = s.nextInt()
    }

    print("Enter the length of Array in intArray2 : ")
    size = s.nextInt()

    val intArray2 = IntArray(size)

    println("Enter Array Elements: ")
    for (i in intArray2.indices) {
        print("intArray2[$i] : ")
        intArray2[i] = s.nextInt()
    }

    println("Array1 : ${intArray1.contentToString()}")
    println("Array2 : ${intArray2.contentToString()}")

    var concatArray = intArray1+intArray2

    println("Concat Element : ${concatArray.contentToString()}")
    println("Concat Size : ${concatArray.size}")

}







