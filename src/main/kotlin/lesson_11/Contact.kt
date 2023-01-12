package lesson_11

class Contact(
    var avatar: String = "StandartLogo.png",
    var contactName: String,
    val closeFriendsHeaders: MutableList<String> = mutableListOf(),
    val closeFriendsNames: MutableList<String> = mutableListOf(),
    _mobilePhone: String,
    _homePhone: String,
    _iCloud: String,
) {
    var mobilePhone: String = _mobilePhone
        set(value) {
            field = if (value.matches("\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d".toRegex()))
                "${value[0]} (${value.substring(1, 4)}) ${value.substring(4, 7)}" +
                        "-${value.substring(7, 9)}-${value.substring(9)}"
            else {
                println("Неправильно введенный сотовый номер подсвечивается красным")
                value
            }

        }
    var homePhone: String = _homePhone
        set(value) {
            field = if (value.matches("\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d".toRegex()))
                "${value[0]} (${value.substring(1, 4)}) ${value.substring(4, 7)}" +
                        "-${value.substring(7, 9)}-${value.substring(9)}"
            else {
                println("Неправильно введенный домашний номер подсвечивается красным")
                value
            }
        }

    var iCloud: String = _iCloud
        set(value) {
            field = if ('@' in value && '.' in value) value
            else {
                println("Неправильно введенная электронная почта подсвечивается красным")
                value
            }
        }

    override fun toString() = "name: $contactName\navatar: $avatar\nmobile phone : $mobilePhone\n" +
            "home phone: $homePhone\niCloud: $iCloud"

    fun call() {
        println("Вызов $contactName")
    }

    fun write() {
        println("Написать смс $contactName")
    }

    fun video() {
        println("Позвонить по видеосвязи $contactName")
    }

    fun mail() {
        println("написать на почту $iCloud")
    }

    fun faceTimeVideo() {
        println("Позвонить по FaceTime по видеосвязи на номер $mobilePhone")
    }

    fun faceTimeCall() {
        println("Позвонить по FaceTime на номер $mobilePhone")
    }

    fun addFriend(header: String, name: String) {
        closeFriendsNames.add(header)
        closeFriendsNames.add(name)
    }
}
