package lesson_11

class User(
    private val id: Int,
    private val login: String,
    private val password: String,
    private val email: String,
    ) {

    override fun toString() = "id = $id, login = $login, password = $password, email = $email"
}

