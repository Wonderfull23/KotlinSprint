package lesson_19

fun main() {
    println("You can add the following fish to the aquarium:")
    for (i in Fish.values()) println(i.type)
}

enum class Fish(val type: String){
    Guppy("guppy"),
    Angelfish("angel fish"),
    Goldfish("gold fish"),
    SiameseFightingFish("siamese fighting fish"),
}
