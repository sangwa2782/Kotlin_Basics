import java.util.*
import kotlin.math.hypot

//Program to calculate and display student grades in Kotlin

fun main() {
    var read = Scanner(System.`in`)

    val subjectName = arrayOf<String>("Hindi","English","Physics","Chemistry","Math")

    val marksArray = DoubleArray(5)

    println("Enter marks: ")
    for (i in marksArray.indices) {
        print("${subjectName[i]} : ")
        marksArray[i] = read.nextDouble()
    }

    val total = marksArray.sum()
    var percentage = marksArray.average()

    println("Total marks : $total")
    println("Percentage : $percentage")

    when {
        percentage > 80 -> println("A Grade")
        percentage > 60 -> println("B Grade")
        percentage > 40 -> println("C Grade")
    }




}





