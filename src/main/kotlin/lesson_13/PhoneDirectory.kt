package lesson_13

class PhoneDirectory(
    private val contacts: MutableList<Contact>,
) {
    fun printDirectory() {
        for (contact in contacts) {
            contact.printInfo()
            println()
        }
    }
}