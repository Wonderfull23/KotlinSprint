package lesson_14

fun main() {
    val cargo1 = CargoShip("Victoria")
    val icebreaker1 = IcebreakerShip("Ermak")

    cargo1.takeInTow(icebreaker1)
    cargo1.rotateTowerCrane()
    cargo1.printCharacteristics()
    println()
    icebreaker1.breakIce()
    icebreaker1.measureTheIce()
    icebreaker1.printCharacteristics()
}