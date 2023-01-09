package lesson_10

fun main() {
    println("Enter the password length")
    println("Your password: ${createPassword(readln().toInt())}")
}

fun createPassword(length: Int) : String? {
    val chars = "#$%&'()*+,-./:;&lt;=&gt;?@[\\]^_`~" + ('0'..'9').joinToString("")
    var password = ""
    return if (length > 0) {
        for (i in 0 until length) password += chars.random()
        password
    } else {
        println("The length of the password must be greater then 0")
        null
    }
}