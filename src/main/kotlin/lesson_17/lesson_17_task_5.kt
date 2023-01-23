package lesson_17

fun main() {
    val user = User("Alex", "3453igjdsfo")
    user.printInfo()
    user.password = "gdsgfdgs"
    user.login = "Sasha"
    user.printInfo()
}
