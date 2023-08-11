fun main(args: Array<String>) {
   for (i in 1..10) {
       println("$i")
   }

     println("using step 2")
    for (i in 1..10 step 2){
        println("$i")
    }


    println("using until")
    for (i in 1 until 6) {
        println("$i")
    }

    //we can also apply step method on reverse counting
    println("Reverse Counting")
    for (i in 10 downTo 2) {
        println("$i")
    }

    println("Create a Table")
    val x = 5
    for (i in 1..10){
        println("$x * $i = ${x*i}")
    }


}