package lesson_17

class User(
    _login: String,
    _password: String,
) {
    var password = _password
        get()  = "*".repeat(field.length)
        set(value) = println("Вы не можете изменить пароль")

    var login = _login
        set(value) {
            field = value
            println("Смена логина выполнена успешно")
        }
    fun printInfo() = println("login: $login, password: $password")
}