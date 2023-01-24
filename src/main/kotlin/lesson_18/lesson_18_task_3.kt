package lesson_18

fun main() {
    val fox = FoxTamagotchi("Alice")
    val dog = DogTamagotchi("Valera")
    val cat = CatTamagotchi("Barsik")
    val zoo = listOf(fox, dog, cat)
    zoo.forEach { it.eat() }
    zoo.forEach { it.sleep() }
    zoo.forEach { it.play() }
}