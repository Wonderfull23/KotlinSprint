package lesson_15

fun main() {
    val temperatureMessage = TemperatureMessage(-4.1)
    val precipitation = Precipitation(1.3)
    temperatureMessage.connectToServer()
    temperatureMessage.sendMessage()
    precipitation.sendMessage()
}