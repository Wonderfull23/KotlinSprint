package lesson_9

fun main() {
    println("Enter 5 ingredients in one line separated by comma and space")
    val ingredients = readln().split(", ")
    println("Your sorted list: ${ingredients.sorted().joinToString(", ")}")
}