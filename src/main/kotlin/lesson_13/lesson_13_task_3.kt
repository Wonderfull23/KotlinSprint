package lesson_13

fun main() {
    val contacts = mutableListOf(
        Contact1("Ростислав", "89123456789", "Reddit"),
        Contact1("Олег", "89457456189", null),
        Contact1("Алиса", null, null),
        Contact1("Алекс", null, "Ozon")
    )
    val phoneDirectory = PhoneDirectory(contacts)
    phoneDirectory.printDirectory()
}