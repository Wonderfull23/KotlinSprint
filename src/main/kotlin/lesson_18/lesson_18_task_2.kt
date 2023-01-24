package lesson_18

fun main() {
    val dices = listOf(Dice4(), Dice6(), Dice8())
    dices.forEach{ println("Your number is: ${it.getNumber()}") }
}