package lesson_2

fun main() {
    val classMarks = mutableListOf(3, 4, 3, 5)
    val average = (classMarks.sum().toDouble() / classMarks.size)

    println(average)
}
