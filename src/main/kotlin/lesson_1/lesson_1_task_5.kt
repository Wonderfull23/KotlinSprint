package lesson_1

val seconds = 6480
const val secondsInMinutes = 60

fun main() {
    val minutes = seconds / secondsInMinutes
    println(if (seconds < 10) "$minutes:0${seconds % minutes}" else "$minutes:0${seconds % minutes}")
}