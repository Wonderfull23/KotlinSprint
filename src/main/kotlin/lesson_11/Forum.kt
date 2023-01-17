package lesson_11

class Forum {
    var id = 0
    private val thread = mutableListOf<String>()
    private val users = mutableListOf<User>()

    fun createNewUser(login: String, password: String, email: String, bio: String = ""): User {
        println("User $login, id$id added to the forum")
        val newUser = User(id++, login, password, email, bio)
        users.add(newUser)
        return newUser
    }

    fun newMessage(author: User, message: String) {
        for (user in users)
            if (user.id == author.id) thread.add("${user.login}: $message")
    }

    fun printThread() {
        thread.forEach { println(it) }
    }
}