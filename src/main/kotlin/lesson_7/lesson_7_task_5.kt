package lesson_7

fun main() {
    println("Enter password length please:")
    val passwordLength = readln().toInt()
    var password = ""

    var chars = ""
    for (i in '0'..'9') chars += i
    for (i in 'a'..'z') chars += i
    for (i in 'A'..'Z') chars += i

    for (i in 0 until passwordLength) {
        password += chars.random()
    }
    println("Your random password: $password")
}