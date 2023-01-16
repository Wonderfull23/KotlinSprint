package lesson_14

class CargoShip(
    name: String,
    speed: Int = 40,
    length: Int = 300,
    width: Int = 60,
    boxCapacity: Int = 1000,
    enginePower: Int = 4000,
    canBreakIce: Boolean = false
) : Ship(name, speed, length, width, boxCapacity, enginePower, canBreakIce) {
    fun takeInTow(ship: Ship){
        println("Cargo ship $name takes ship ${ship.name} in tow ")
        speed /= 2
    }

    fun rotateTowerCrane() {
        println("Rotate the tower of the cran 15 degrees clockwise ")
    }
}