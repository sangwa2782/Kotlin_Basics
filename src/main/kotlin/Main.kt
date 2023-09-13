import java.util.ArrayList
import java.util.Objects
import java.util.Scanner
import kotlin.math.pow




//1:- Kotlin program to Reverse, Ascending & Descending



fun main(args: Array<String>) {

  val s = Scanner(System.`in`)

    print("Enter Number of words in String Array : ")
    val size = s.nextInt()

    val strArray  = Array<String>(size){""}

   print("Enter Words of Array : ")
    for (i in strArray.indices) {
        print("Arry Word[$i] : ")
        strArray[i] = readln().toString()
    }

    println("String Array Elements : ${strArray.contentToString()}")

    //for reverse
    var reverseArray = strArray.reversedArray()
    println("Reversed Array list = ${reverseArray.contentToString()}")

    //Ascending order
    var strAscending = strArray.sortedArray()
    println("Array in Ascending Order : ${strAscending.contentToString()}")

    //Descending order
    var strDescending = strArray.sortedArrayDescending()
    println("Array in Descending order : ${strDescending.contentToString()}")

}







