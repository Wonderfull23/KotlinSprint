package lesson_11

class Contact {
    constructor(
        avatar: String = "StandartLogo.png",
        contactName: String,
        closeFriendsHeaders: MutableList<String> = mutableListOf(),
        closeFriendsNames: MutableList<String> = mutableListOf(),
        mobilePhone: String,
        homePhone: String,
        iCloud: String,
    ) {
        this.avatar = avatar
        this.contactName = contactName
        this.closeFriendsHeaders = closeFriendsHeaders
        this.closeFriendsNames = closeFriendsNames
        this.mobilePhone = mobilePhone
        this.homePhone = homePhone
        this.iCloud = iCloud
    }

    var avatar: String
    var contactName: String
    var closeFriendsHeaders: MutableList<String>
    var closeFriendsNames:  MutableList<String>

    var mobilePhone: String
        set(value) {
            field = if (value.matches("\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d".toRegex()))
                "${value[0]} (${value.substring(1, 4)}) ${value.substring(4, 7)}" +
                        "-${value.substring(7, 9)}-${value.substring(9)}"
            else {
                throw IllegalArgumentException("incorrect format")
            }
        }

    var homePhone: String
        set(value) {
            field = if (value.matches("\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d".toRegex()))
                "${value[0]} (${value.substring(1, 4)}) ${value.substring(4, 7)}" +
                        "-${value.substring(7, 9)}-${value.substring(9)}"
            else {
                throw IllegalArgumentException("incorrect format")
            }
        }

    var iCloud: String
        set(value) {
            field = if ('@' in value && '.' in value) value
            else {
                throw IllegalArgumentException("incorrect format")
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
