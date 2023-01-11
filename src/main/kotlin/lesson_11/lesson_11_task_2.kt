package lesson_11

fun main() {
    val user = User(
        1234567,
        "JohnSnow",
        "loveNorth",
        "johnsnow@gmail.com",
    )

    user.setBio()
    user.changePassword()
    user.printUserInformation()
    user.sendMessage("Hello, when will be the 9th season?")
}