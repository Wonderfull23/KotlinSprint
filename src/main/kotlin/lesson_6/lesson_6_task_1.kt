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
        if (userInputPassword == userPassword) break
        println("Неверный пароль")
    } while (userInputPassword != userPassword)

    println("Авторизация прошла успешно")
}