import java.util.Scanner

fun main(args: Array<String>) {
//Kotlin Program to Count Number of Digits in an Integer

    var reader = Scanner(System.`in`)
    print("Enter the number: ")

    var num = reader.nextInt()

    var num2  = num.toInt()
//    var num = 2547856

    var count = 0

    while (num2 != 0)
    {
        num2 /= 10
        ++count
    }

    println("Number of digits: $count")

}