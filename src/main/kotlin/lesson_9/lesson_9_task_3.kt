package lesson_9

fun main() {
    val ingredients = mutableListOf(2, 50, 15)

    println("Введите количество порций:")
    val portions = readln().toInt()
    for (i in ingredients.indices) ingredients[i] *= portions
    println("На $portions порций вам понадобится: Яиц – ${ingredients[0]} шт.," +
            "молока – ${ingredients[1]} гр.," +
            "сливочного масла – ${ingredients[2]} гр.")
}