package lesson_15

class CommunityMember(id: Int, login: String, password: String, email: String, bio: String = "") :
    User(id, login, password, email, bio) {

    override fun sendMessage(message: String) = "Message from CommunityMember $login: $message"

    override fun readForum() = println("CommunityMember $login has read a thread")
}