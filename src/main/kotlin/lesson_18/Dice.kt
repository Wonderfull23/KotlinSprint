package lesson_18

abstract class Dice(private val side: Int) {
    fun getNumber() = (1..side).random()
}

class Dice4(side: Int = 4) : Dice(side)
class Dice6(side: Int = 6) : Dice(side)
class Dice8(side: Int = 8) : Dice(side)