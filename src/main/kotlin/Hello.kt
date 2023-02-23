//import kotlin.random.Random
//
//fun main(args: Array<String>) {
////    print("Hello, ${args[0]}")
////
////    // Will assign kotlin.Unit
//////    val isUnit = println("This is an expression")
//////    println(isUnit)
////
//////    val temperature = 10
//////    val isHot = if (temperature > 50) true else false
//////    println(isHot)
////
////    val temperature = 10
////    val message = "The water temperature is ${ if (temperature > 50) "too warm" else "OK"}."
////    println(message)
////}
import java.util.*
//fun feedTheFish(){
//    val day = randomDay()
//    val food = "pellets"
//    println("Today is $day and the fish eat $food")
//}
//
//fun main(args: Array<String>){
//    feedTheFish()
//}

fun randomDay(): String{
    val week = arrayOf("Monday", " Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}


fun fishFood (day : String) : String {
    return when (day){
        "Monday" -> "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "nothing"
    }

}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)

    println("Today is $day and the dish eat $food")
}

fun main(args: Array<String>) {
    feedTheFish()
}