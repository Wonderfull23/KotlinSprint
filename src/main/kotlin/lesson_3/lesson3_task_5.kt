package lesson_3

fun main() {
    val inputLine = "D2-D4;0"
    val move1 = inputLine.substring(0,2)
    val move2 = inputLine.substring(3,5)
    val step = inputLine.substringAfter(';')

    println(move1)
    println(move2)
    println(step)
}