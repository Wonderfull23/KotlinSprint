package lesson_11

fun main() {
    val forum = Forum()
    forum.createNewUser("SpiderMan", "12345678", "peterparker@gmail.com", "<3 Marry Jane")
    forum.createNewUser("Tony Stark", "12341234", "ironman@gmail.com")
    forum.createNewUser("Hulk", "1111", "Hulk@gmail.com", "Hulk smash!!!")
    forum.newMessage(0, "Do you see my last movie?")
    forum.newMessage(1, "Where is Robert jr?")
    forum.newMessage(1,"not in my movie")
    forum.newMessage(2,"Hulk smash!")
    forum.printThread()

}