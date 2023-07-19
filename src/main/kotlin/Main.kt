import java.util.Scanner

fun main(args: Array<String>) {
//Check whether an alphabet is vowel or consonant using if..else statement


    val ch = 'i'

    val vowelConsonant = if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') "vowel" else "consonant"

    println("$ch is $vowelConsonant")

}