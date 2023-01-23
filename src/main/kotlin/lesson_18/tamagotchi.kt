package lesson_18

abstract class Tamagotchi(val name: String){
    abstract fun eat()
    abstract fun sleep()
    abstract fun play()
}

class FoxTamagotchi(name: String) : Tamagotchi(name){
    override fun eat() = println("Fox $name is eating")
    override fun sleep() = println("Fox $name is sleeping")
    override fun play() = println("Fox $name is playing")
}

class DogTamagotchi(name: String) : Tamagotchi(name){
    override fun eat() = println("Dog $name is eating")
    override fun sleep() = println("Dog $name is sleeping")
    override fun play() = println("Dog $name is playing")
}

class CatTamagotchi(name: String) : Tamagotchi(name){
    override fun eat() = println("Cat $name is eating")
    override fun sleep() = println("Cat $name is sleeping")
    override fun play() = println("Cat $name is playing")
}