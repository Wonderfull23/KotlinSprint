package lesson_13

class Contact(
    private val name: String?,
    private val phoneNumber: String?,
    private val company: String?,
) {

    fun printInfo() = println(
        "Имя: ${name ?: "Не указано"}\n" +
                "Номер: ${phoneNumber ?: "Не указано"}\nКомпания: ${company ?: "Не указано"}"
    )

}
