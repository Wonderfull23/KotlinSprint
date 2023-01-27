package lesson_19

fun main() {
    val id = Id()
    val jeans = Product("Jeans", id.getId(), Category.CLOTHES)
    jeans.printInfo()
    val pen = Product("Pen", id.getId(),  Category.STATIONERY)
    pen.printInfo()
    val lipstick = Product("Lipstick", id.getId())
    lipstick.printInfo()
}
class Id{
    private var id = 0
    fun getId() = id++
}