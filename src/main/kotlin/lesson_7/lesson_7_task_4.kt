package lesson_7

fun main() {
    println("Какое количество секунд нужно зачесь?")
    val seconds = readln().toInt()

    for (i in seconds downTo 0) {
        println(i)
        Thread.sleep(1000)
    }
    println("Время вышло")
}
