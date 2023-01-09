package lesson_10

fun main() {
    println("Введите логин:")
    val login = readln()
    println("Введите пароль:")
    val password = readln()
    checkLength(login, password)
}

fun checkLength(login: String, password: String) {
    if (login.length < 4 || password.length < 4) println("Логин или пароль недостаточно длинные")
}