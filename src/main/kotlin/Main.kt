import java.lang.StringBuilder
import java.util.Scanner

//Program to count the number of words in a string in Kotlin


fun countWords(inputString: String): Int {
    val strArray = inputString.split(" ".toRegex()).toTypedArray()

    var count = 0

    for (s in strArray) {
        if (s != "") {
            count++
        }
    }
    return count
}

fun main(args: Array<String>) {
//Kotlin program to find total number of vowels, consonants, digits and spaces in a string
    val reader = Scanner(System.`in`)
    print("Enter a String: ")
    val a:String = reader.nextLine()



    //Print words Count in a String
    println("No. of Words in String : " + countWords(a))
}




