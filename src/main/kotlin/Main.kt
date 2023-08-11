import kotlin.math.pow

fun main(args: Array<String>) {
    //kotlin Array manipulation

    var arr = arrayOf("One","Two","Three")
    var arr2 = arrayOf(1,2,3,4,5,6)
    var arr3  = arrayOf<Int>(1,2,5,6,8)

    println("for simple array")
    for (i in arr) {
        println("$i")
    }

    println("for array with index")
    for ((i,e) in arr.withIndex()) {
        println("$i - $e")
    }

    println(" print with selected data")
    println("${arr[2]}")
    println("${arr.get(1)}")
    arr.set(0,"Five")

    println(arr[1])
    println(arr.size)

//    for (i in arr) {
//        println("$i")
//    }




}