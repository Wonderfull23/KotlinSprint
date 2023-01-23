package lesson_18

open class Order {
    open fun getOrder() = ""
}

class oneThingOrder(private val order: String) : Order() {
    override fun getOrder() = "Заказан товар: $order"
}

class manyThingsOrder(private val order: List<String>) : Order() {
    override fun getOrder() = "Заказаны следующие товары: ${order.joinToString(", ")}"
}
