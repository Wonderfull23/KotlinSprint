package lesson_11

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