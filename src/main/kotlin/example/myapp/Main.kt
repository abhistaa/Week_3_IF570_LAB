package example.myapp

//fun buildAquarium() {
//
//    val myAquarium = Aquarium(width = 25, length = 25, height = 40)
//    myAquarium.printSize()
//    val myTower = TowerTank(diameter = 25, height = 40)
//    myTower.printSize()
//
////    val aquarium6 = Aquarium(length = 25, width = 25, height = 40)
////    aquarium6.printSize()
//
////    val aquarium6 = Aquarium(numberOfFish = 29)
////    aquarium6.printSize()
////    aquarium6.volume = 70
////    aquarium6.printSize()
//
////    val aquarium6 = Aquarium(numberOfFish = 29)
////    aquarium6.printSize()
////    println("Volume: ${aquarium6.width * aquarium6.length * aquarium6.height /
////            1000} liters")
//
////    val aquarium1 = Aquarium()
////    aquarium1.printSize()
////    // default height and length
////    val aquarium2 = Aquarium(width = 25)
////    aquarium2.printSize()
////    // default width
////    val aquarium3 = Aquarium(height = 35, length = 110)
////    aquarium3.printSize()
////    // everything custom
////    val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
////    aquarium4.printSize()
//}

fun makeFish() {

    val shark = Shark()
    val pleco = Plecostomus()
    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()

//    val shark = Shark()
//    val pleco = Plecostomus()
//    println("Shark: ${shark.color}")
//    println("Plecostomus: ${pleco.color}")
}
fun main () {
    makeFish()
}

//fun main(){
//    buildAquarium()
//}
