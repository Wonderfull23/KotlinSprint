package lesson_12

class Day4(
    private val dayTemperature: Int,
    private val nightTemperature: Int,
    private val atmospherePressure: Int,
    private val isRain: Boolean = false,
) {

    init {
        println(
            "Today is: day temperature: $dayTemperature°C, " + "night temperature: $nightTemperature°C, " +
                    "was rain: $isRain, atmosphere pressure: $atmospherePressure mmHg at sea level"
        )
    }
}