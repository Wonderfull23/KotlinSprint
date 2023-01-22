package lesson_16

fun main() {
    val player = Player("Gerald")
    player.getDamage(10)
    player.heal(30)
    player.getDamage(80)
    player.heal(40)
    player.getDamage(100)
}