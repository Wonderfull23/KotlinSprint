package lesson_1
fun main() {
    val seconds = 6480
    val secondsInMinutes = 60

    val minutes = seconds / secondsInMinutes
    println("$minutes:0${seconds % minutes}")
}