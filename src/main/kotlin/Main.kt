import java.util.Scanner

//Check given number is letter digit or special charecter
fun main(args: Array<String>) {
//Find Factorial of a number using for loop
    val reader = Scanner(System.`in`)
    print("Enter a character: ")

    val a = reader.next()[0]

    when {
        a.isLetter()-> println("Letter")
        a.isDigit()-> println("Digit")
        else-> println("Special Charecter")
    }


    
}