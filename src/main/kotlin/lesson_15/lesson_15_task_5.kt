package lesson_15

fun main() {
    val truck1 = Truck()
    truck1.cargoTransport(2000)
    truck1.peopleTransport(1)
    truck1.move()

    val passengerCar1 = PassengerCar()
    passengerCar1.peopleTransport(3)
    passengerCar1.move()

    val passengerCar2 = PassengerCar()
    passengerCar2.peopleTransport(2)
    passengerCar2.cargoTransport(1000)
    passengerCar2.move()
}