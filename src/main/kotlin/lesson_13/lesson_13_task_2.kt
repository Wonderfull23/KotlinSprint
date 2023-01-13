package lesson_13

fun main() {
    val contact1 = PhoneDirectory("Ростислав", "89123456789", "Reddit")
    val contact2 = PhoneDirectory("Олег", "89457456189", null)
    contact1.printInfo()
    contact2.printInfo()
}