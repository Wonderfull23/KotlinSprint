package lesson_11

class User(
    val id: Int,
    val login: String,
    var password: String,
    private val email: String,
    private var bio: String = "",
) {

    override fun toString() = "id = $id, login = $login, password = $password, email = $email"

    fun printUserInformation() = println("User $login information: ${toString()}")

    fun setBio() {
        println("Edit your bio:")
        bio = readln()
    }

    fun changePassword() {
        do {
            println("Enter your current password:")
            val checkPassword = readln()
            if (checkPassword != password) println("You entered wrong password")
        } while (checkPassword != password)
        println("Enter a new password:")
        password = readln()
    }

    fun sendMessage(message: String) {
        println(message)
    }
}
