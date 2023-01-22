package lesson_17

fun main() {
    val package1 = Package("Passwords", 10, true)
    println(package1.name)
    println(package1.filesNumber)
    package1.flag = false
    println(package1.name)
    println(package1.filesNumber)
}