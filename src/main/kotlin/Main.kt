import java.util.Scanner

fun main(args: Array<String>) {
// Find Largest Among three numbers using if..else statement

    val reader = Scanner(System.`in`)
    print("Enter First number: ")
    val a = reader.nextInt()

    print("Enter Second number: ")
    val b = reader.nextInt()

    print("Enter Third number: ")
    val c = reader.nextInt()

    if (a >= b && a >= c)
    {
        println("$a is largest number")
    }
    else if (b >= a && b >= c)
    {
        println("$b is largest number")
    }
    else{
        println("$c is largest number")
    }


}