package lesson_4

fun main() {
    val day = 5
    val hands = day == 1
    val legs = day == 3
    val back = day == 5
    val abs = day == 1 || day == 3 || day ==5

    println("Упражнения для рук:    $hands\n" +
            "Упражнения для ног:    $legs\n" +
            "Упражнения для спины:  $back\n" +
            "Упражнения для пресса: $abs")
}
