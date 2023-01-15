package lesson_14

abstract class Ship(
    val name: String,
    var speed: Int,
    val length: Int,
    val width: Int,
    val boxCapacity: Int,
    val enginePower: Int,
    val canBreakIce: Boolean,
) {
    fun printCharacteristics() = println(
        "Name : $name\nSpeed: $speed\nLength: $length\nWidth: $width\n" +
                "Box capacity: $boxCapacity\nEngine power: $enginePower\nCan break ice: $canBreakIce"
    )

    fun currentSpeed() = println("Current speed is: $speed km/h")

    fun boxesPerShip() = println("now there are $boxCapacity boxes on the ship")
}

