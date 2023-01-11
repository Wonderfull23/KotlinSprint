package lesson_11

fun main() {
    val contact1 = Contact("CatLogo.png", "First Name Second Name",
        closeFriendsHeaders = mutableListOf("жена", "подруга", "подруга",),
    closeFriendsNames = mutableListOf("userName", "userName", "userName"))
    contact1.mobilePhone = "89999994242"
    contact1.homePhone = "89998884242"
    contact1.iCloud = "mail@mail.ru"
    println(contact1)
}