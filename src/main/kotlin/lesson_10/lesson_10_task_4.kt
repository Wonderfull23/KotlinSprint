package lesson_10

fun main() {
    var askUser = "Хотите бросить кости? Введите Да или Нет"

    do {
        println(askUser)
        val userInput = readln()
        if (userInput.lowercase() == "да") {
            val userDice = throwTheDice()
            println("Вы выбросили ${userDice[0]} и ${userDice[1]}")
            val computerDice = throwTheDice()
            println("Компьютер выбросил ${computerDice[0]} и ${computerDice[1]}")
            compareDice(userDice, computerDice)
            askUser = "Хотите бросить кости еще раз Введите Да или Нет"
        }
    } while (userInput.lowercase() == "да")
}

private fun throwTheDice() = listOf((1..6).random(), (1..6).random())

private fun compareDice(userDice: List<Int>, computerDice: List<Int>) {
    when {
        userDice.sum() > computerDice.sum() -> println("Победило человечество")
        userDice.sum() < computerDice.sum() -> println("Победила машина")
        else -> println("Ничья")
    }
}