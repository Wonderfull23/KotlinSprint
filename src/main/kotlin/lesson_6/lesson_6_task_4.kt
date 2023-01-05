package lesson_6

fun main() {
    val randomNum = (1..9).random()
    var attempt = 5

    while (attempt > 0) {
        attempt--
        println("Введите ваше число")
        if (readln().toInt() != randomNum) {
            println(if (attempt != 0) "Неверно, попробуйте еще раз" else "Было загадано число $randomNum")
            continue
        }
        else {
            println("Это была великолепная игра!")
            break
        }
    }
}