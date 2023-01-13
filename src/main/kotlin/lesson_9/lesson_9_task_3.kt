package lesson_9

fun main() {
    val ingredients = mutableListOf(2, 50, 15)

    println("Введите количество порций:")
    val portions = readln().toInt()
    val allIngredients = ingredients.map { it * portions }
    println("На $portions порций вам понадобится: Яиц – ${allIngredients[0]} шт.," +
            "молока – ${allIngredients[1]} гр.," +
            "сливочного масла – ${allIngredients[2]} гр.")
}