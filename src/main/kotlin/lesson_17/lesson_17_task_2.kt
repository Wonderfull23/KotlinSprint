package lesson_17

fun main() {
    val ship = Ship("Victoria", 30, "Port ELIZABETH IMO9238571")
    ship.printInfo()
    ship.name = "August"
    ship.printInfo()
}