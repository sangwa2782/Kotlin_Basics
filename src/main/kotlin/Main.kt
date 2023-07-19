import java.util.Scanner

fun main(args: Array<String>) {
   //take input from user
    var reader = Scanner(System.`in`)
    print("Enter a Number: ")

    var num:Int = reader.nextInt()

    if (num % 2 == 0)
    {
        println("Your number is Even")
    } else {
        println("Your number is Odd")
    }

}