package lesson_11

fun main() {
    val room1 = Room(
        envelope = "Don'tPanicLogo.jpg", name = "Don't panic chat",
        members = mutableListOf(
            Member(avatar = "Fire.jpg", nickname = "ievetrov", badge = "разговаривает"),
            Member(avatar = "defaultAvatar.jpg", nickname = "Wonderfull23", badge = "микрофон выключен")
        )
    )

    val room2 = Room(
        envelope = "BallLogo.jpg", "Room for great football players",
        members = mutableListOf(
            Member(avatar = "Messi.jpg", nickname = "Leo", badge = "пользователь заглушен"),
            Member(avatar = "Ronaldo.jpg", nickname = "CR7", badge = "разговаривает"),
            Member(avatar = "Shevchenko.jpg", nickname = "Sheva", badge = "пользователь заглушен"),
            Member(avatar = "Zidane.jpg", nickname = "Zizu", badge = "микрофон выключен")
        )
    )

    val room3 = Room(
        envelope = "friendsLogo.jpg", "Room for friends",
        members = mutableListOf(
            Member(avatar = "cat.jpg", nickname = "Vova", badge = "микрофон выключен"),
            Member(avatar = "puppy.jpg", nickname = "Sasha", badge = "разговаривает"),
            Member(avatar = "mem.jpg", nickname = "Anton", badge = "микрофон выключен"),
        )
    )

    val ribbon1 = (mutableListOf(room1, room2, room3))
}