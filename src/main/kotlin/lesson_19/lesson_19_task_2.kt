package lesson_19

fun main() {
    val id = Id()
    val jeans = Product("Jeans", id.getId(), Category.CLOTHES)
    jeans.printInfo()
    val pen = Product("Pen", id.getId(),  Category.STATIONERY)
    pen.printInfo()
    val wallet = Product("Wallet", id.getId())
    wallet.printInfo()
}
class Id{
    private var id = 0
    fun getId() = id++
}