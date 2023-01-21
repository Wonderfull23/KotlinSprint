package lesson_16

class Circle(private val radius: Int) {
    private val Pi = 3.14

    fun circleLength() = 2 * Pi * radius
    fun circleArea() = Pi * radius * radius
}