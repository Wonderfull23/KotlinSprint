package lesson_11

fun main() {
    val forum = Forum()
    val user1 = forum.createNewUser("SpiderMan", "12345678", "peterparker@gmail.com", "<3 Marry Jane")
    val user2 = forum.createNewUser("Tony Stark", "12341234", "ironman@gmail.com")
    val user3 = forum.createNewUser("Hulk", "1111", "Hulk@gmail.com", "Hulk smash!!!")
    forum.newMessage(user1, "Do you see my last movie?")
    forum.newMessage(user1, "Where is Robert jr?")
    forum.newMessage(user2,"not in my movie")
    forum.newMessage(user3,"Hulk smash!")
    forum.printThread()

}