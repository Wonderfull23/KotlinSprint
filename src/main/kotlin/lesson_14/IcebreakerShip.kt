package lesson_14

class IcebreakerShip(
    name: String,
    speed: Int = 20,
    length: Int = 200,
    width: Int = 40,
    boxCapacity: Int = 500,
    enginePower: Int = 6000,
    canBreakIce: Boolean = true,
) : Ship(name, speed, length, width, boxCapacity, enginePower, canBreakIce) {
}