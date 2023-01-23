package lesson_17

class Parcel(
    private val trackNumber: Int,
    _location: String,
    var transferCount: Int = 0,
) {
    var location = _location
        set(value) {
            field = value
            transferCount++
        }

    fun printInfo() = println("The parcel $trackNumber location: $location, number of transfers: $transferCount")
}