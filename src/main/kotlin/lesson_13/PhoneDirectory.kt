package lesson_13

class PhoneDirectory(
    private val contacts: MutableList<Contact1>,
) {
    fun printDirectory() {
        for (contact in contacts) {
            contact.printInfo()
            println()
        }
    }

    fun addNewContact() {
        do {
            println("Имя нового контакта:")
            val contactName: String? = readLine()
            println("Телефонный номер нового контакта:")
            val phoneNumber: String? = readLine()
            println("Компания нового контакта:")
            val company: String? = readLine()
            if (contactName == null || phoneNumber == null || contactName == "" || phoneNumber == "")
            println("Запись не создана")
            else contacts.add(Contact1(contactName, phoneNumber, company))
            println("Если хотите добавить новую запись, введите \"да\"")
            val userInput = readln()
        } while (userInput.lowercase() == "да")
    }
}