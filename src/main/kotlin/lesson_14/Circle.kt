package lesson_14

class Circle(color: String, private val diameter: Double) : Figure(color) {
    override fun area() = Math.PI * diameter * diameter

    override fun perimeter() = Math.PI * diameter
}