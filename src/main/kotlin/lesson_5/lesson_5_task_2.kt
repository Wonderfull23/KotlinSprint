package lesson_5

const val AGE_OF_MAJORITY = 18

fun main() {
    var currentYear = 2023
    println("Введите год вашего рождения:")
    val userAge = currentYear - readln().toInt()

    println( if (userAge >= AGE_OF_MAJORITY) "Показать экран со скрытым контентом" else "Вернуться на главный экрвн")
}