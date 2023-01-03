package lesson_2
const val minutesInHour = 60
fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelMinutes = 457
    val travelHours = travelMinutes / minutesInHour

    var arrivalHour = departureHour + travelHours
    var arrivalMinute = departureMinute + (travelMinutes - travelHours * 60)
    if (arrivalMinute > 60) {
        arrivalMinute -=60
        arrivalHour++
    }
    println("$arrivalHour:$arrivalMinute")
}