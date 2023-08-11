import kotlin.math.pow

fun main(args: Array<String>) {
// METHOD OVERRIDDING

    val oneplus = OnePlus()
    oneplus.display()
    val generalMobile = Mobile()
    generalMobile.display()




}

open class Mobile() {
    open val name: String = ""
    open val size : Int = 5
    fun makeCall() = println("Calling from Mobile")
    fun  powerOff() = println("Shutting Down")
    open fun display() = println("Simple Mobile Display")

}

class OnePlus : Mobile()
{
    override val name: String = "One Plus"
    override val size:Int = 6
    override fun display() = println("One Plus Display")
}