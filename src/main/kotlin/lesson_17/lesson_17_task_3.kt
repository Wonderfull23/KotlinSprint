package lesson_17

fun main() {
    val parcel = Parcel(12312432, "Minsk")
    parcel.printInfo()
    parcel.location = "Brest"
    parcel.printInfo()

}