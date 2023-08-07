import java.lang.StringBuilder
import java.util.Scanner

//Palindrom word



fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)
    print("Enter a String: ")
    var a = reader.next()


    if (a == a.reversed()) {
        println("Your word is palindrom" )
    }
    else {
        println("Your word is not palindrom" )
    }

    //Print words Count in a String

}




