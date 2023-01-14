package lesson_12

fun main() {
    val numOfDays = 10
    val days = mutableListOf<Day5>()
    var sumDayTemperature = 0
    var sumNightTemperature = 0
    var sumAtmospherePressure = 0
    var sumRainingDays = 0

    repeat(numOfDays) {
        val dayTemperature = (-30..40).random()
        val nightTemperature = dayTemperature - (1..10).random()
        val atmospherePressure = (715..800).random()
        val isRain = (0..1).random() == 0
        days.add(Day5(dayTemperature, nightTemperature, atmospherePressure, isRain))
    }


    for (i in days) {
        sumDayTemperature += i.dayTemperature
        sumNightTemperature += i.nightTemperature
        sumAtmospherePressure += i.atmospherePressure
        if (i.isRain) sumRainingDays++
    }

    println(
        "Statistics:\n" +
                "Average day temperature for $numOfDays days: ${sumDayTemperature / numOfDays} °C\n" +
                "Average night temperature for $numOfDays days: ${sumNightTemperature / numOfDays} °C\n" +
                "Average atmosphere pressure for $numOfDays days: ${sumAtmospherePressure / numOfDays} mmHg at sea level\n" +
                "Raining days for $numOfDays days: $sumRainingDays"
    )
}