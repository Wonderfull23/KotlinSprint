package lesson_7

fun main() {
    do {
        val randomCode = (1000..9999).random()
        println("Ваш код авторизации: $randomCode")
        println("Введите ваш код авторизации:")
        val userInput = readln().toInt()
        if(userInput == randomCode) {
            println("Добро пожаловать!")
            break
        } else println("Неверный код")
    } while (userInput != randomCode)
}
