package lesson_19

fun main() {
    println(
        "You need to create 5 people cards according to the following example:\n" +
                "Name: [enter your name], sex: [2 types of sex are available, female and male]"
    )
    val directory = List(5) { Human(readName(), readSex()) }
    directory.map { it.printInfo() }
}

fun readName(): String {
    println("Enter a name:")
    val name = readln()
    return if (name.isNullOrEmpty()) "Unknown Name" else name
}

fun readSex(): Sex {

    while (true) {
        println("Enter sex:")
        when (readln().uppercase()) {
            Sex.MALE.name -> {
                return Sex.MALE
            }

            Sex.FEMALE.name -> {
                return Sex.FEMALE
            }

            else -> println("Enter Male or Female sex")
        }
    }
}


