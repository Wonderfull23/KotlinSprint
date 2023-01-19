package lesson_14

class Satellite(
    name: String,
    habitat: Boolean,
    hasAtmosphere: Boolean,
    hasWater: Boolean,
    suitableForLanding: Boolean,
    val planetName: String,
) : CelestialObject(name, habitat, hasAtmosphere, hasWater, suitableForLanding) {
}