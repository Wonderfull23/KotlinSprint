package lesson_14

fun main() {
    val colours = listOf("Red", "Black", "Green")
    val figures = mutableListOf<Figure>()


    repeat(2) {
        figures.add(Circle(colours.random(), getSize()))
        figures.add(Rectangle(colours.random(), getSize(), getSize()))
        figures.add(Triangle(colours.random(), getSize(), getSize(), getSize()))
    }

    val redFigures = figures.filter { it.color == "Red" }

    println("Sum of perimeters: ${sumOfPerimeters(redFigures)}")
    println("Sum of areas: ${sumOfAreas(redFigures)}")
}

fun sumOfPerimeters(figures: List<Figure>): Double {
    var sum = 0.0
    for (i in figures) sum += i.perimeter()
    return sum
}

fun sumOfAreas(figures: List<Figure>): Double {
    var sum = 0.0
    for (i in figures) sum += i.area()
    return sum
}

fun getSize() = (10..20).random().toDouble()