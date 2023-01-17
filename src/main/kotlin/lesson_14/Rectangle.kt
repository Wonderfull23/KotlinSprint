package lesson_14

class Rectangle(color: String, private val length: Double, private val width: Double) : Figure(color) {
    override fun area() = length * width

    override fun perimeter() = 2 * (length + width)
}