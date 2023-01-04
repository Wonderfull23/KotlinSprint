package lesson_4

fun main() {
    println("Есть ли повреждения корпуса?")
    val damage = readln().toBoolean()
    println("Текущая численность экипажа:")
    val team = readln().toInt()
    println("Текущее количество ящиков провизии:")
    val boxes = readln().toInt()
    println("Благиприятные ли метеоусловия?")
    val weatherConditions = readln().toBoolean()
    val minTeam = 55
    val recommendedTeam = 70
    val minBoxes = 50

    println (if ((!damage && team in minTeam until recommendedTeam && boxes > minBoxes) ||
            (damage && team == recommendedTeam && boxes > minBoxes && weatherConditions))
        "Корабль может полететь" else "Корабль не может полететь")
}