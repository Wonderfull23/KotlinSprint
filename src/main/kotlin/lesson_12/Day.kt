package lesson_12

class Day(
    _dayTemperature: Int = 10,
    _nightTemperature: Int = 0,
    _isRain: Boolean = false,
    _atmospherePressure: Int = 750,
) {
    var dayTemperature = _dayTemperature
    var nightTemperature = _nightTemperature
    var isRain = _isRain
    var atmospherePressure = _atmospherePressure

    override fun toString() = "Today is: day temperature: $dayTemperature°C, " +
            "night temperature: $nightTemperature°C, " +
            "was rain: $isRain, atmosphere pressure: $atmospherePressure mmHg at sea level"
}