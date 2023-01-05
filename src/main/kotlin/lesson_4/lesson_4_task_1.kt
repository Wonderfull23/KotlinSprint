package lesson_4

const val SEATS = 13

fun main() {
    val todaySeats = 13
    val tomorrowSeats = 9

    println("Доступность столиков на сегодня: ${todaySeats < SEATS}\n" +
            "Доступность столиков на завтра: ${tomorrowSeats < SEATS}")
}