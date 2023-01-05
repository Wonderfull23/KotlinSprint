package lesson_5

fun main() {
    val users = mutableMapOf("password" to "Batman",)
    println("Введите логин:")
    val userName = readln()

    if (!users.containsValue(userName)) println("Пользователь с таким логином не найден, хотите зарегистрироваться?")
    else {
        println("Введите пароль:")
        val userPassword = readln()
        if (users.containsKey(userPassword) && users[userPassword] == userName) println("Здравствуйте, $userName!")
        else println("Ошибка авторизации, неверный пароль")
    }
}