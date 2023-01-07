package lesson_8

fun main() {
    val recipe = arrayOf("tomato", "cucumber", "salt", "chicken", "bread", "lemon", "paper")

    println("What ingredient do ypu want ti find?")
    if (readln().lowercase() in recipe) println("This ingredient is in the recipe")
    else println("This ingredient is not in the recipe")
}