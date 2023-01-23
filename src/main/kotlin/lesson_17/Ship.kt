package lesson_17

class Ship(_name : String, private val averageSpeed: Int, private val portOfRegistry: String) {
    var name = _name
        set(value) = println("Can't change name\n")

    fun printInfo() = println("Name: $name\nAverage speed: $averageSpeed\nPort of registry: $portOfRegistry\n")
}