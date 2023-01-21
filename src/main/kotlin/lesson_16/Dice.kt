package lesson_16

class Dice {
    private fun random() = (1..6).random()
    fun printRandomNumber() = println("number ${random()} rolled on the dice")
}