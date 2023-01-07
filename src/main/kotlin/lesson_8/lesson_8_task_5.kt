package lesson_8

fun main() {
    println("First enter how much ingredient will be in you list?\nThen just input all the ingredients one by one")
    val list = Array<String>(readln().toInt()) { readln() }

    println("Your list of ingredients: ${list.joinToString(", ")}.")
}