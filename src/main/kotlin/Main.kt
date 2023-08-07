import java.util.Scanner

//Program to find the frequency of character in a string in Kotlin
fun main(args: Array<String>) {
//Kotlin program to find total number of vowels, consonants, digits and spaces in a string
    val reader = Scanner(System.`in`)
    print("Enter a String: ")
    val a = reader.nextLine()

    val reader2 = Scanner(System.`in`)
    print("Enter Charecter: ")
    val b = reader2.next()[0]

    var count = 0

    for (i in a.indices) {
        if (b == a[i])
            count++
    }
    println("Frequency of $b is : $count")




    
}