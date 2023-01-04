package lesson_4

fun main() {
    val seats = 13
    val todaySeats = 13
    val tomorrowSeats = 9

    println("Доступность столиков на сегодня: ${todaySeats < seats}\n" +
            "Доступность столиков на завтра: ${tomorrowSeats < seats}")
}