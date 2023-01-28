package lesson_20

fun main() {
   val checkKey = {  player: Player3 ->
        if (player.hasKey) println("Игрок ${player.name} открыл дверь")
        else println("Дверь заперта")
    }
    checkKey((Player3("Alex", false)))
    checkKey(Player3("Dina", true))
}