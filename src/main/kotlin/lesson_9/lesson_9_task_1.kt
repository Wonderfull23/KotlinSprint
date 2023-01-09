package lesson_9

fun main() {
    val ingredients = listOf("garlic", "tomato", "cucumber", "bread", "chicken", "nuts")

    println("В рецепте есть следующие ингредиенты: $ingredients")
    for (i in ingredients) println(i)
}