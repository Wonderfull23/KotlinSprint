package lesson_16

class Player(
    val name: String,
    private var health: Int = 100,
    private var strength: Int = 100,
) {
    private var isDead = false

    init {
        println(("New player:\nname: $name\nhealth: $health hp\nstrength: $strength\n"))
    }

    fun getDamage(damage: Int) {
        if (health > 0) {
            println("$name get $damage damage\n")
            health -= damage
            if (health <= 0) death()
            printStatistics()
        }
    }

    fun heal(hp: Int) {
        if (!isDead) {
            println("$name heal $hp hp\n")
            health += hp
            if (health > 100) health = 100
            printStatistics()
        }
    }

    private fun death() {
        health = 0
        strength = 0
        isDead = true
        println("Wasted\n")
    }

    fun printStatistics() = println("name: $name\nhealth: $health hp\nstrength: $strength\n")
}