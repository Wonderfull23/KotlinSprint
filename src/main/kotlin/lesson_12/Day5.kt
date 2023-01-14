package lesson_12

class Day5(
    val dayTemperature: Int,
    val nightTemperature: Int,
    val atmospherePressure: Int,
    val isRain: Boolean = false,
) {

    init {
        println(
            "Today is: day temperature: $dayTemperature°C, " + "night temperature: $nightTemperature°C, " +
                    "was rain: $isRain, atmosphere pressure: $atmospherePressure mmHg at sea level"
        )
    }

}