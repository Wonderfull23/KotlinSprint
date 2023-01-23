package lesson_18

abstract class Dice {
    abstract fun getNumber(): Int
}

class Dice4 : Dice() {
    override fun getNumber() = (1..4).random()
}

class Dice6 : Dice() {
    override fun getNumber() = (1..6).random()
}

class Dice8 : Dice() {
    override fun getNumber() = (1..8).random()
}