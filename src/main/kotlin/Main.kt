import kotlin.math.pow

fun main(args: Array<String>) {
  var result1 = Person("A", 17)
    var result2 = Person("B", 20)

    println(result1.canVote())
    println(result2.canVote())
}

class Person(val name:String, var age:Int) {
    fun canVote():Boolean {
        return age>18
    }
}