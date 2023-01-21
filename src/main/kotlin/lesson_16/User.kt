package lesson_16

class User(val login: String, private val password: String) {

    fun checkPassword(){
        println("Enter user password:")
        println(if (readln() == password) "Correct password" else "Wrong password")
    }

}
