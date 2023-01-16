package lesson_14

fun main() {
    val planet1 =
        Planet(
            name = "Mars",
            habitat = false,
            hasAtmosphere = false,
            hasWater = false,
            suitableForLanding = true,
            hasSatellite = true
        )
    val satellites = listOf(
        Satellite(
            name = "Phobos",
            habitat = false,
            hasAtmosphere = false,
            hasWater = false,
            suitableForLanding = false,
            planetName = planet1.name
        ),
        Satellite(
            name = "Deimos",
            habitat = false,
            hasAtmosphere = false,
            hasWater = false,
            suitableForLanding = false,
            planetName = planet1.name
        )
    )

    planet1.printName()
    planet1.satelliteNames(satellites)
}