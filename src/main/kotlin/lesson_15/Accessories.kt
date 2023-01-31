package lesson_15

class Accessories(
    private val accessories: Map<String, Int>
) : Searchable {
    override fun search(goods: String) {
        println("Выполняется поиск")
        if (!accessories.containsKey(goods.lowercase()))
            println("Нет такого товара на складе")
        else if (accessories.getValue(goods.lowercase()) > 0)
            println("Количество товара $goods на складе: ${accessories.getValue(goods)} шт.")
        else println("Товар $goods закончился, следющее поступление в понедельник ")
    }
}
