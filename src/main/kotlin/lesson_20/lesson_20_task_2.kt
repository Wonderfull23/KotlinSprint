package lesson_20

fun main() {
    val player = Player("Starix", 10)
    val getHealingPotion: (Int) -> Unit = {
        if (it > 0) player.health += it
        if (player.health > player.maxHealth) player.health = 100
    }

    getHealingPotion(15)
    player.printInfo()
    getHealingPotion(-1000)
    player.printInfo()
    getHealingPotion(99)
    player.printInfo()
}


