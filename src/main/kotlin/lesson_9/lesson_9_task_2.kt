package lesson_9

fun main() {
    val ingredients = mutableListOf("chicken", "tomato", "eggs")

    println("В рецепте есть базовые ингредиенты: ${ingredients.joinToString(", ")}")
    println("Желаете добавить еще?")
    if (readln().lowercase() == "да") {
        println("Какой ингредиент вы хотите добавить?")
        ingredients.add(readln())
        println("Теперь в рецепте есть следующие ингредиенты: ${ingredients.joinToString(", ")}")
    }
}