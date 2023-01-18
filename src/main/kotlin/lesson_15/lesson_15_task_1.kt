package lesson_15

fun main(){
    val crucian1 = Crucian()
    val duck1 = Duck()
    val seagull1 = Seagull()

    println("Way of mooving a crucian: ${crucian1.swim()}")
    println("Way of mooving a duck: ${duck1.swim()}, ${duck1.fly()}")
    println("Way of mooving a seagull: ${seagull1.swim()}, ${seagull1.fly()}")
}