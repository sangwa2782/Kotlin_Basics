import java.util.Objects
import kotlin.math.pow




//1:- Write a program to sort element of array in kotlin



fun main(args: Array<String>) {
    val array = arrayOf(6,3,5,3,2,5,1,2,2,3,4,6,6,6,5,5,1,4,10,7)

    //------------- using function ---------------//
    val data = removeDuplicates(array)
    println(data.contentToString())
    //------------------- view function ----------//


// 1 using distinction()
//    var data = array.distinct()
//    println(data)

//2 using toSet()
//    var data = array.toSet()
//    println(data)

//3 toMutableSet()
//    var data = array.toMutableSet()
//    println(data)

//4 toHashSet
//    var data = array.toHashSet()
//    println(data)

}

fun removeDuplicates(array: Array<Int>): IntArray {
    return array.distinct().toIntArray()
}







