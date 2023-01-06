package lesson_7

fun main() {
    println("Enter password length please:")
    val passwordLength = readln().toInt()
    var password = ""

    for (i in 0 until passwordLength) {
        val arr = arrayOf(('0'..'9').random(), ('A'..'Z').random(), ('a'..'z').random())
        password += arr[(arr.indices).random()]
    }
    println("Your random password: $password")
}