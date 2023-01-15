package lesson_4

fun main() {
    val day = 2
    val isEven = day % 2 == 0
    val arms = !isEven
    val abs = !isEven
    val legs = isEven
    val back = isEven
    val message = """
        Упражнения для рук:    $arms
        Упражнения для ног:    $legs
        Упражнения для спины:  $back
        Упражнения для пресса: $abs
    """.trimIndent()
    println(message)
}
