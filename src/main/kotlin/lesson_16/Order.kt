package lesson_16

class Order(private val orderNumber: Int, private var orderStatus: String) {
    init {
        println("Status of order $orderNumber is $orderStatus")
    }
    fun changeStatus(orderNumber: Int, newStatus: String){
        orderStatus = newStatus
        println("New status of order $orderNumber is $orderStatus")
    }
}