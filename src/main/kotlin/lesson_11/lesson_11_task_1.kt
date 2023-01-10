package lesson_11

class User (
    private val id: Int,
    private val login: String,
    private val password: String,
    private val email: String,
        ) {
    override fun toString() = "id = $id, login = $login, password = $password, email = $email"
}

fun main() {
    val user1 = User(
        12345,
        "Vitalik.eth",
        "12345678",
        "Vitaliketh@gmail.com"
    )
    val user2 = User(
        34567,
        "PavelDurov",
        "12345678",
        "returnthewall@mail.ru"
    )
    println("User information: ${user1.toString()}")
    println("User information: ${user2.toString()}")
}