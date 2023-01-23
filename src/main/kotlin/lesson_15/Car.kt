package lesson_15

abstract class Car(
    private val peopleCapacity: Int,
    var peopleInCar: Int = 0,
    private val cargoCapacity: Int,
    private var cargoInCar: Int = 0,
) : Movable, PeopleTransportable, CargoTransportable {

    override fun peopleTransport(people: Int) {
        if (people in 0..peopleCapacity) peopleInCar += people
        else println("People capacity is less than $people")
    }

    override fun cargoTransport(cargo: Int) {
        if (cargo in 0..cargoCapacity) cargoInCar += cargo
        else println("Cargo capacity is less than $cargo")
    }

    override fun move() {
        println("The car moves with the number of people: $peopleInCar")
        println("The machine moves with a load: $cargoInCar kg\n")
    }
}