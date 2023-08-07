import java.util.Scanner

fun main(args: Array<String>) {
//Find Factorial of a number using for loop

    var reader = Scanner(System.`in`)
    print("Enter the number: ")

    var num = reader.nextInt()

    var num2  = num.toInt()
//    var num = 2547856

    var factorial = 1

    for (i in 1..num2)

        factorial *= i

    println("Number of digits: $factorial")

}