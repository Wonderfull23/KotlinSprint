package lesson_10

fun main() {
    val userInformation = signUp()
    authorization(userInformation)
}

fun signUp(): List<String> {
    println("Enter login to sign up:")
    var login: String
    do {
        login = readln()
    } while (!validateLogin(login))
    val password = generatePassword()
    println("You have successfully registered!\nYour login: $login\nYour password: $password")
    return listOf(login, password)
}

fun validateLogin(login: String): Boolean {
    return if (login.length < 4) {
        println("Login must contain 4 or more characters")
        false
    } else true
}

fun generatePassword(): String {
    val chars = "#$%&'()*+,-./:;&lt;=&gt;?@[\\]^_`~" + ('0'..'9').joinToString("") +
                ('a'..'z').joinToString("") + ('A'..'Z').joinToString("")
    var password = ""
    var passwordLength: Int

    println("What length of password do you want to create?")
    do {
        passwordLength = readln().toInt()
        println("The length of the password must be 8 or greater")
    } while (passwordLength < 8)

    for (i in 0 until passwordLength) password += chars.random()
    return password
}

fun authorization(userInformation: List<String>){
    do {
        println("Enter your login to sign in:")
        val login = readln()
        println("Enter your password to sign in:")
        val password = readln()
        if (compareUserInformation(userInformation, login, password))
            println("You entered wrong data, please try again")
    } while (compareUserInformation(userInformation, login, password))

    println("You should complete sms verification")
    smsCaptcha()
}

fun compareUserInformation(userInformation: List<String>, login: String, password: String) =
    login != userInformation[0] || password != userInformation[1]

fun smsCaptcha() {
    do {
        val code = sms()
        println("Enter your SMS code please")
        val userInput = readln()
        validateSmsCode(code, userInput)
        if (!validateSmsCode(code, userInput)) println("Wrong code, please try again")
    } while (!validateSmsCode(code, userInput))
    println("Successful authorization!")
}

fun sms(): String {
    var code = ""
    repeat(4) {code += ('0'..'9').random()}
    println("Your SMS code is: $code")
    return code
}

fun validateSmsCode(code: String, userInput: String) = code == userInput