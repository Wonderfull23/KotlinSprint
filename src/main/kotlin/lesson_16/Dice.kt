package lesson_16

class Dice {
    private val result = (1..6).random()
    fun printRandomNumber() = println("number $result rolled on the dice")
}