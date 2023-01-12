package lesson_13

class PhoneDirectory(
    val name: String,
    val phoneNumber: String,
    val company: String?,
) {

    fun printInfo() = println("Имя: $name\nНомер: $phoneNumber\nКомпания: ${company ?: "Не указано"}")
}
