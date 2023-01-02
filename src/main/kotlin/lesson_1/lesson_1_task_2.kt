package lesson_1
    var numberOfOrders: Int = 75
    val thankText: String = "Thank you for choosing our product"
    var numberOfWorkers = 2000

fun main() {
    println("Number of orders: $numberOfOrders")
    println("Thank text: $thankText")
//    println("Number of workers: $numberOfWorkers")
    numberOfWorkers = 1999
    println("Number of workers: $numberOfWorkers")
}
