package lesson_2

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val buff = 0.2

    println("additional crystal ore : ${(crystalOre* buff).toInt()}")
    println("additional iron ore : ${(ironOre* buff).toInt()}")
}