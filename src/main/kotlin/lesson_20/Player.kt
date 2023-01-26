package lesson_20

class Player(
    private val name: String,
    var health: Int,
    val maxHealth: Int = 100,
) {
    fun printInfo() = println("Name: $name, health: $health")
}