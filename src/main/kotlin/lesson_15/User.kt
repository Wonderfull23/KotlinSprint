package lesson_15

abstract class User(
    val id: Int,
    val login: String,
    var password: String,
    private val email: String,
    private var bio: String = "",
) {

    abstract fun sendMessage(message: String): String

    open fun readForum() = println("User $login has read a thread")

}