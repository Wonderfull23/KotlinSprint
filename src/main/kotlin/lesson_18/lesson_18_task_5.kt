package lesson_18

fun main() {
    val screen = Screen()
    val point =  Point(10.0, 14.5)
    val circle = Circle(22.0, 17.8, 23.0)
    val square1 = Square(-11.3, 0.0, 16.9)
    val square2 = Square(-20000.0, 0.0, 16.9)

    screen.draw(point)
    screen.draw(circle)
    screen.draw(square1)
    screen.draw(square2)
}