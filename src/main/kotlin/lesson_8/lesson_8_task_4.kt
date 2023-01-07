package lesson_8

fun main() {
    val ingredients = arrayOf("tomato", "cucumber", "salt", "chicken", "bread", "lemon", "paper")
    println(ingredients.joinToString(", ") + '.')

    println("What ingredient do you want to replace?")
    val replacedIngredient = readln()
    if (replacedIngredient in ingredients) {
        println("Add new ingredient:")
        ingredients[ingredients.indexOf(replacedIngredient)] = readln()
    } else println("This ingredient is not in the list")

    println(ingredients.joinToString(", ") + '.')
}