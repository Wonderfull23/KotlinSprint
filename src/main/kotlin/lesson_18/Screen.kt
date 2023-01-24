package lesson_18

class Screen {
    private var width = -1000.0..1000.0
    private var high = -1000.0..1000.0

    fun draw(figure: Point) {
        if (insideTheScreen(figure)) println("Draw point at x: ${figure.x} y: ${figure.y}")
        else println("Yur point is outside the screen")
    }

    fun draw(figure: Circle) {
        if (insideTheScreen(figure))
            println("Draw circle with center at x: ${figure.x} y: ${figure.y} and radius: ${figure.radius} mm")
        else println("Yur circle is outside the screen")
    }

    fun draw(figure: Square) {
        if (insideTheScreen(figure))
            println("Draw square at x: ${figure.x} y: ${figure.y} and side: ${figure.side} mm")
        else println("Yur square is outside the screen")
    }

    private fun insideTheScreen(figure: Figure) = figure.x in width && figure.y in high
}
