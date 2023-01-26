package lesson_19

fun main() {
    println("You can add the following fish to the aquarium:")
    for (i in Fish.values()) println(i.type)
}

enum class Fish(val type: String){
    GUPPY("guppy"),
    ANGELFISH("angel fish"),
    GOLDFISH("gold fish"),
    SIAMESE_FIGHTING_FISH("siamese fighting fish"),
}
