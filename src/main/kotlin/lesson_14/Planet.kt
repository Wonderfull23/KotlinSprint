package lesson_14

class Planet(
    name: String,
    habitat: Boolean,
    hasAtmosphere: Boolean,
    hasWater: Boolean,
    suitableForLanding: Boolean,
    val hasSatellite: Boolean,
) : CelestialObject(name, habitat, hasAtmosphere, hasWater, suitableForLanding) {
    fun printName() = println("Planet name: $name")

    fun satelliteNames(satellites: List<Satellite>) {
        if (hasSatellite){
            println("Satellites of $name:\n${(satellites.map { it.name }).joinToString(", ")}")
        }

        else println("Planet $name hasn't satellites")
    }
}