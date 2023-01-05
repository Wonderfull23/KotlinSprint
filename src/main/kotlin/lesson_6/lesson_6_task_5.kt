package lesson_6

fun main() {
    println("Введите логин для регистрации:")
    val userLogin = readln()
    println("Введите пароль для регистрации:")
    val userPassword = readln()

    while (true) {
        println("Введите логин для входа:")
        if  (readln() != userLogin) {
            println("Неверный логин")
            continue
        }
        else {
            println("Введите пароль для входа:")
            if (readln() != userPassword) {
                println("Неверный пароль")
                continue
            } else {
                captcha()
                break
            }
        }
    }
}

fun captcha(): Boolean {
    var attempt = 3

    while (attempt > 0) {
        attempt--
        val randomNumbers = Array<Int>(2) {(1..9).random()}
        println("Введите ответ: ${randomNumbers[0]} + ${randomNumbers[1]}")
        if (readln().toInt() == randomNumbers.sum()) {
            println("Добро пожаловать!")
            return true
        } else {
            if( attempt != 0) println("Неправильный ответ")
            else println("Доступ запрещен")
            continue
        }
    }
    return false
}