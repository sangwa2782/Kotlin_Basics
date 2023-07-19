import java.util.Scanner

fun main(args: Array<String>) {
//  Kotlin Program to Display Fibonacci Series

  val num = 10
  var t1 = 0
  var t2 = 1

  for (i in 1..num){
    print("$t1 + ")

    val sum = t1 + t2
    t1 = t2
    t2 = sum


  }

}