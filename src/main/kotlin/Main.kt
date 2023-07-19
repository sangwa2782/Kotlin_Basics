import java.util.Scanner

fun main(args: Array<String>) {
//  Generate Multiplication Table using for loop

  var reader = Scanner(System.`in`)
  print("Enter a Number: ")

  var num = reader.nextInt()

 for (i in 1..10){
   val product = num * i
   println("$num * $i = $product")
 }

}