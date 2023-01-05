package lesson_5

fun main() {
    val randomNumbers = arrayOf((1..100).random(), (1..100).random())
    println("Введите ваше первое число:")
    val userNumber1 = readln().toInt()
    println("Введите ваше второе число:")
    val userNumber2 = readln().toInt()

    if (randomNumbers.contains(userNumber1) && randomNumbers.contains(userNumber2))
        println("Поздравляем! Вы выиграли главный приз!")
    else if (randomNumbers.contains(userNumber1) || randomNumbers.contains(userNumber2))
        println("Вы выиграли утешительный приз!")
    else println("Неудача! Крутите барабан!")
    println("Выигрышные числа: ${randomNumbers[0]} и ${randomNumbers[1]}")
}