package lesson_12

class Day{
    var dayTemperature: Int = 10
    var nightTemperature: Int = 0
    var isRain: Boolean = false
    var atmospherePressure: Int = 750

    override fun toString() = "Today is: day temperature: $dayTemperature°C, " +
    "night temperature: $nightTemperature°C, " +
    "was rain: $isRain, atmosphere pressure: $atmospherePressure mmHg at sea level"
}