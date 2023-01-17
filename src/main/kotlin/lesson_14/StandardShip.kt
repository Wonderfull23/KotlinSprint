package lesson_14

class StandardShip(
    name: String,
    speed: Int = 60,
    length: Int = 100,
    width: Int = 20,
    boxCapacity: Int = 300,
    enginePower: Int = 1000,
    canBreakIce: Boolean = false
) : Ship(name, speed, length, width, boxCapacity, enginePower, canBreakIce) {
}