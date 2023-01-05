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
                println("Авторизация прошла успешно")
                break
            }
        }
    }
}