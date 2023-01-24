package lesson_18

fun main() {
    val order1: Order = oneThingOrder("pizza")
    val order2: Order = manyThingsOrder(listOf("jam", "milk", "sushi"))

    println(order1.getOrder())
    println(order2.getOrder())
}