import java.util.Scanner

//Program to find total number of vowels, consonants, digits and spaces in a string in Kotlin
fun main(args: Array<String>) {
//Kotlin program to find total number of vowels, consonants, digits and spaces in a string
    val reader = Scanner(System.`in`)
    print("Enter a String: ")

    val a = reader.nextLine()

    var Vowel = 0
    var Consonent = 0
    var whitespace = 0
    var digit = 0
    var specialCharecters = 0

    if (!a.isNullOrEmpty()) {

        val s = a.lowercase()

        for (i in s.indices) {

            when(s[i]) {
                'a','e','i','o','u' -> Vowel++
                in 'a'..'z'-> Consonent++
                in '0'..'9' -> digit++
                ' ' -> whitespace++
                else -> specialCharecters++

            }

        }
        println("Vowels : $Vowel")
        println("Consonants : $Consonent")
        println("Digits : $digit")
        println("white Spaces : $whitespace")
        println("white specialCharecters : $specialCharecters")

    } else {
        println("You entered a empty value")
    }


    
}