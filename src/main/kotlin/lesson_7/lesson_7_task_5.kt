package lesson_7

fun main() {
    println("Enter password length please:")
    var chars = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    val passwordLength = readln().toInt()
    var password = ""

    for (i in 0 until passwordLength) {
        password += chars.random()
    }
    println("Your random password: $password")
}