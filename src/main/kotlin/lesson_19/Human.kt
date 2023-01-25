package lesson_19

data class Human(val name: String, val sex: Sex) {
    fun printInfo() = println("Name: $name, sex: ${sex.name.lowercase()}")
}