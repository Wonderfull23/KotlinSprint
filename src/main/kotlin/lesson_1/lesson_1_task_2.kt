package lesson_1
fun main() {
    var numberOfOrders: Int = 75
    val thankText: String = "Thank you for choosing our product"
    var numberOfWorkers = 2000

    println("Number of orders: $numberOfOrders")
    println("Thank text: $thankText")
//    println("Number of workers: $numberOfWorkers")
    numberOfWorkers = 1999
    println("Number of workers: $numberOfWorkers")
}
