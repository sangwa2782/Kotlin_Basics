fun main(args: Array<String>) {

    var result = add(4,5)
    println(result)
    val result2 = add(6,7)
    println(result2)

    evenOdd(8)
    evenOdd(11)

    printMessage(5)
    printMessage()

}

//Funtions are the set of instructions that perform a specific task

// Simple Add function
fun add(x:Int, y:Int):Int = x + y


// Function to check number is even of odd
fun evenOdd(x: Int) {
    val result = if (x % 2 == 0) "Even" else "Odd"
    println(result)
    //in kotlin, when there is no return type then it has inbuilt return type is Unit.

}

//print message with default argument(Int = 2)
fun printMessage(count: Int = 2) {
    for (i in 1..count) {
        println("Hello $i")
    }
}