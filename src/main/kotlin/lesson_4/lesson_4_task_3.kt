package lesson_4

fun main() {
    var isSunnyWeather = true
    var isOpenTent = true
    var humidity = 0.2
    var season = "Winter"

    println("Благоприятные ли условия сейчас для роста бобовых? ${isSunnyWeather && isOpenTent && humidity == 0.2 && season != "Winter"}")
}