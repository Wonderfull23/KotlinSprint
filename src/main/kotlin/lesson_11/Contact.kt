package lesson_11

class Contact(
    var avatar: String = "StandartLogo.png",
    var contactName: String,
    val headers: List<String> = listOf("сотовый", "домашний", "FaceTime", "iCloud"),
    val standardLogos: List<String> = listOf("messageLogo.png", "callLogo.png", "cameraLogo.png", "mailLogo.png", ),
    val standardText: List<String> = listOf("написать",  "вызов", "видео", "почта"),
    val faceTimeLogos: List<String> = listOf("videoCameraLogo.png", "call2Logo.png"),
    val closeFriendsHeaders: MutableList<String> = mutableListOf(),
    val closeFriendsNames: MutableList<String> = mutableListOf(),
    ) {
    var mobilePhone: String = ""
        set(value) {
            field = if (value.matches("\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d".toRegex()))
                "${value[0]} (${value.substring(1, 4)}) ${value.substring(4, 7)}" +
                        "-${value.substring(7, 9)}-${value.substring(9)}"
            else {
                println("Неправильно введенный сотовый номер подсвечивается красным")
                value
            }

        }
    var homePhone: String = ""
        set(value) {
            field = if (value.matches("\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d".toRegex()))
                "${value[0]} (${value.substring(1, 4)}) ${value.substring(4, 7)}" +
                        "-${value.substring(7, 9)}-${value.substring(9)}"
            else {
                println("Неправильно введенный домашний номер подсвечивается красным")
                value
            }
        }

    var iCloud: String = ""
        set(value) {
            field = if ('@' in value && '.' in value) value
            else {
                println("Неправильно введенная электронная почта подсвечивается красным")
                value
            }
        }
    override fun toString() = "name: $contactName\navatar: $avatar\nmobile phone : $mobilePhone\n" +
            "home phone: $homePhone\niCloud: $iCloud"

}
