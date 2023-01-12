package lesson_11

class Member(
    val avatar: String,
    val nickname: String,
    val badge: String,
) {
    fun showNickname() = println(nickname)
}