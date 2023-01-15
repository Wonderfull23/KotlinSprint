package lesson_13

fun main() {
    val contacts = mutableListOf(
        Contact("Ростислав", "89123456789", "Reddit"),
        Contact("Олег", "89457456189", null),
        Contact("Алиса", null, null),
        Contact("Алекс", null, "Ozon")
    )
    val phoneDirectory = PhoneDirectory(contacts)

    phoneDirectory.addNewContact()
    phoneDirectory.printDirectory()
}