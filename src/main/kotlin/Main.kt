import java.util.ArrayList
import java.util.Objects
import java.util.Scanner
import kotlin.math.pow




//1:- Program to convert character array to string in Kotlin



fun main(args: Array<String>) {
    //Input Stream
    val scanner = Scanner(System.`in`)

    //Input char array size
    print("Enter the Char Array Size: ")
    val size = scanner.nextInt()

    //create char array of given size
    val charArray = CharArray(size)

    //Input array element
    println("Enter Char Arrays Element: ")
    for (i in charArray.indices) {
        print("charArray[$i] : ")
        charArray[i] = scanner.next()[0]
    }

    //Print All Array Element
    println("Array : ${charArray.concatToString()}")

    //get string from char array
    var strFromArray = String(charArray)

    //print string from array
    println("String converted from array : $strFromArray")


}







