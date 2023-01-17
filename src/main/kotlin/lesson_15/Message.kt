package lesson_15

abstract class Message(val text: Double) {

    fun connectToServer() {
        println("Connect to the server")
    }

    abstract fun sendMessage()
}
