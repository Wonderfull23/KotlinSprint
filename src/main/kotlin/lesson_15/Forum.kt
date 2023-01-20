package lesson_15

class Forum {
    val thread = mutableListOf<String>()

    fun printThread() = thread.forEach { println(it) }

    fun deleteMessage(message: String) = thread.removeIf { it.contains(message) }
}
