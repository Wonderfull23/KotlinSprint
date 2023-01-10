package lesson_11

class Member(
    var avatar: String,
    private val nickname: String,
    private val badgeStatus: List<String> = listOf("разговаривает", "“микрофон выключен", "пользователь заглушен"),
    var badge: String = badgeStatus[badgeStatus.indices.random()],
) {
    fun showNickname() = println(nickname)
}