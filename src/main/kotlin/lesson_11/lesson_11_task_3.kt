package lesson_11

fun main() {
    val room1 = Room(envelope = "Don'tPanicLogo.jpg", name = "Don't panic chat",
        members = mutableListOf(Member(avatar = "Fire.jpg", nickname = "ievetrov"),
        Member(avatar = "defaultAvatar.jpg", nickname = "Wonderfull23")))

    val room2 = Room("BallLogo.jpg", "Room for great football players",
        mutableListOf(Member("Messi.jpg", "Leo"), Member("Ronaldo.jpg", "CR7"),
            Member("Shevchenko.jpg", "Sheva"), Member("Zidane.jpg", "Zizu")))

    val room3 =  Room("friendsLogo.jpg", "Room for friends",
        mutableListOf(Member("cat.jpg", "Vova"), Member("puppy.jpg", "Sasha"),
            Member("mem.jpg", "Anton"), Member("anime.jpg", "Denis")))

    val room4 =  Room("TonLogo.jpg", "Ton holders",
        mutableListOf(Member("PrettyBody.jpg", "PavelDurov"), Member("HackerLogo.jpg", "Nikolai Durov"),
            Member("SEC.jpg", "Gary Gensler"), Member("defaultAvatar.jpg", "Wonderfull23")))

    val ribbon1 = (mutableListOf(room1, room2))
    val ribbon2 = (mutableListOf(room3, room4))
}