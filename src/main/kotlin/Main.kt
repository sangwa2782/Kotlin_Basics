import java.util.ArrayList
import java.util.Objects
import java.util.Scanner
import kotlin.math.pow




//1:- Kotlin program to convert string to character array



fun main(args: Array<String>) {
    //Input Stream
    val scanner = Scanner(System.`in`)

    //Input string
    print("Enter String: ")
    val str = scanner.nextLine()

    //convert string to character array
    var charArray = str.toCharArray()



    //print character array get from string
    println("Character Array Element : ${charArray.contentToString()}")


}







