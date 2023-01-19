package lesson_15

class Administrator(id: Int, login: String, password: String, email: String, bio: String = "") :
    User(id, login, password, email, bio) {

    override fun sendMessage(message: String) = "Message from Administrator $login: $message"

    override fun readForum() = println("Administrator $login has read a thread")

    fun deleteMessage(user: User, message: String, thread: List<String>): String {
        for (i in thread) {
            if (i.contains("${user.login}: $message")) {
                println("Administrator $login deleted message from ${user.login}: $message")
                break
            }
        }
        return "${user.login}: $message"
    }
}
