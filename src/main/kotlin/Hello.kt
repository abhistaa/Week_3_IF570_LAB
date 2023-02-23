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
// import java.util.*
//fun feedTheFish(){
//    val day = randomDay()
//    val food = "pellets"
//    println("Today is $day and the fish eat $food")
//}
//
//fun main(args: Array<String>){
//    feedTheFish()
//}

//fun randomDay(): String{
//    val week = arrayOf("Monday", " Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
//    return week[Random().nextInt(week.size)]
//}
////
////
//fun fishFood (day : String) : String {
//    return when (day){
//        "Monday" -> "flakes"
//        "Wednesday" -> "redworms"
//        "Thursday" -> "granules"
//        "Friday" -> "mosquitoes"
//        "Sunday" -> "plankton"
//        else -> "nothing"
//    }
//
//}
//
//fun feedTheFish() {
//    val day = randomDay()
//    val food = fishFood(day)
//
//    println("Today is $day and the dish eat $food")
//}
//
//fun main(args: Array<String>) {
//    feedTheFish()
//}

//fun swim(speed: String = "fast"){
//    println("swimming $speed")
//
//}
//
//fun main(){
//    swim()
//    swim("slow")
//    swim(speed = "turtle-like")
//}

//fun isTooHot(temperature: Int) = temperature > 30
//fun isDirty(dirty: Int) = dirty > 30
//fun isSunday(day: String) = day == "Sunday"
//fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 20): Boolean{
//    return when {
//        isTooHot(temperature) -> true
//        isDirty(dirty) -> true
//        isSunday(day) -> true
//        else -> false
//    }
//}

//fun feedTheFish(){
//    val day = randomDay()
//    val food = fishFood(day)
//    println("Today is $day and the fish eat $food")
//    println("Change water: ${shouldChangeWater(day)}")
//}
//
//fun main(){
//    feedTheFish()
//}
//fun main(){
//    val decoration = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpont")
//
//    val eager = decoration.filter { it [0] == 'p' }
//    println("eager: $eager")
//
//    val filtered = decoration.asSequence().filter { it [0] == 'p' }
//    println("filtered: $filtered")
//
//    val newlist = filtered.toList()
//    println("new list: $newlist")
//
//    val lazyMap = decoration.asSequence().map {
//        println("access: $it")
//        it
//    }
//    println("lazy: $lazyMap")
//    println("-----")
//    println("first: ${lazyMap.first()}")
//    println("-----")
//    println("all: ${lazyMap.toList()}")
//
//    val lazyMap2 = decoration.asSequence().filter { it[0] == 'p' }.map {
//        println("access: $it")
//        it
//    }
//    println("-----")
//    println("filtered: ${lazyMap2.toList()}")
//
//    val mysport = listOf("basketball", "fishing", "running")
//    val myplayers = listOf("Lebron James", "Ernest Hemingway", "Usain Bolt")
//    val mycities = listOf("Los Angeles", "Chicago", "Jamaica")
//    val mylist = listOf(mysport, myplayers, mycities)
//    println("-----")
//    println("Flat: ${mylist.flatten()}")
//}

fun main(){
//    var dirtylevel = 20
//    val waterFilter = { dirty : Int -> dirty / 2}
//    println(waterFilter(dirtylevel))

    fun updateDirty(dirty: Int, operation:(Int) -> Int): Int{
        return operation(dirty)
    }
//    val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
//    println(updateDirty(30, waterFilter))

//    fun increaseDirty( start: Int) = start + 1
//    println(updateDirty(15, ::increaseDirty))

    var dirtylevel = 19
    dirtylevel = updateDirty(dirtylevel) { dirtylevel -> dirtylevel + 23}
    println(dirtylevel)
}