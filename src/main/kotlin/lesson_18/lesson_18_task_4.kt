package lesson_18

fun main() {
    val boxes = listOf(RectangleBox(12.5, 12.0, 15.6), CubeBox(10.5))
     println("You need to paint ${boxes.sumOf { it.getArea() }} square sm")
}