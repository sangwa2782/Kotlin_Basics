import java.util.Scanner

fun main(args: Array<String>) {
// Sum of Natural Numbers using for loop

    val num = 100
    var sum = 0

    for (i in 1..num){
        //sum = sum+i
        sum += i
    }

    println("Sum = $sum")

}