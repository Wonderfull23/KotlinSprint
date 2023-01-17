package lesson_15

class Precipitation(text: Double) : Message(text) {
    override fun sendMessage() = println("Precipitation in Minsk today: $text mm")
}