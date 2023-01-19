package lesson_15

class MusicInstruments(
    private val instruments: Map<String, Int>,
) : Searchable {
    override fun search(goods: String) {
        println("Выполняется поиск")
        if (!instruments.containsKey(goods.lowercase()))
            println("Нет такого товара на складе")
        else if (instruments.getValue(goods.lowercase()) > 0)
            println("Количество товара $goods на складе: ${instruments.getValue(goods)} шт.")
        else println("Товар $goods закончился, следющее поступление в понедельник ")
    }
}