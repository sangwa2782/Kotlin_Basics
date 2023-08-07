import java.lang.StringBuilder
import java.util.*

//Function to check two strings are anagram string or not



fun main(args: Array<String>) {
//Function to check two strings are anagram string or not
    val sc = Scanner(System.`in`)

    //Enter String Value
    println("Enter String1 : ")
    val str1: String = sc.nextLine()

    println("Enter String2 : ")
    val str2: String = sc.next()

    //Call Function to  check anagram String
    if (isAnagrams(str1, str2)) {
        println("Anagram Strings !!")
    } else {
        println("Strings are not Anagram !!")
    }
}

fun isAnagrams(str1: String, str2: String): Boolean {
    //Both String Length must be Equal
    if (str1.length != str2.length) {
        return false
    }

    //Convert Strings to character Array
    val strArray1 = str1.toCharArray()
    val strArray2 = str2.toCharArray()

    //Sort the Arrays
    Arrays.sort(strArray1)
    Arrays.sort(strArray2)

    //Convert Arrays to String
    val sortedStr1 = String(strArray1)
    val sortedStr2 = String(strArray2)

    //Check Both String Equals or not After Sorting
    //and Return value True or False
    return sortedStr1 == sortedStr2
}




