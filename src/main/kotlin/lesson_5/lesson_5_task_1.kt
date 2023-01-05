package lesson_5

fun main() {
    val random1 = (1..20).random()
    val random2 = (1..20).random()

    println("Введите результат: $random1 + $random2")
    println(if (readln().toInt() == random1 + random2) "Добро пожаловать!" else "Доступ запрещен.")

}