package lesson_15

fun main() {
    val usersId = Id()
    val forum = Forum()
    val user1 = CommunityMember(usersId.getUserId(), "Jake", "12345678", "dfsfsd@mail.ru")
    val user2 = CommunityMember(usersId.getUserId(), "David", "gdfgdfg23423", "david@mail.ru")
    val user3 = Administrator(usersId.getUserId(), "Ann", "1gfdgd567", "ann@mail.ru")

    forum.thread.add(user1.sendMessage("Hi everyone"))
    forum.thread.add(user2.sendMessage("Hello"))
    forum.thread.add(user2.sendMessage("Hi there"))
    forum.thread.add(user3.sendMessage("qq"))

    forum.printThread()

    forum.deleteMessage(user3.deleteMessage(user3, "Hello", forum.thread))
    forum.deleteMessage(user3.deleteMessage(user1, "sdgjdfg", forum.thread)) // нет такого сообщения

    forum.printThread()

}

class Id {
    var id = 0
    fun getUserId() = id++
}



