package lesson_15

class TemperatureMessage(text: Double) : Message(text) {
    override fun sendMessage() = println("Temperature: $text °C")
}