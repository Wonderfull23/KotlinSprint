package lesson_6

fun main() {
    println("Введите кол-во секунд")
    var seconds = readln().toInt()
    val userInput = seconds

    while (seconds > 0) {
        Thread.sleep(1000)
        seconds--
    }
    println("Прошло $userInput секунд")
}