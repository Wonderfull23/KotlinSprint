package lesson_6

fun main() {
    println("Введите логин для регистрации:")
    val userLogin = readln()
    println("Введите пароль для регистрации:")
    val userPassword = readln()

    do {
        println("Введите логин для входа:")
        val userInputLogin = readln()
        if (userInputLogin == userLogin) break
        println("Неверный логин")
    } while (userInputLogin != userLogin)

    do {
        println("Введите пароль для входа:")
        val userInputPassword = readln()
        if (userInputPassword == userLogin) break
        println("Неверный пароль")
    } while (userInputPassword != userPassword)

    captcha()
}

fun captcha() {
    var attempt = 3

    while (attempt-- > 0) {
        val randomNumbers = Array<Int>(2) {(1..9).random()}
        println("Введите ответ: ${randomNumbers[0]} + ${randomNumbers[1]}")
        if (readln().toInt() == randomNumbers.sum()) {
            println("Добро пожаловать!")
            break
        } else {
            if (attempt != 0) println("Неправильный ответ")
            else println("Доступ запрещен")
            continue
        }
    }
}