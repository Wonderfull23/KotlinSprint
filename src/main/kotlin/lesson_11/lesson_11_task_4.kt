package lesson_11

fun main() {
    val contact1 = Contact(
        "CatLogo.png",
        "First Name Second Name",
        closeFriendsHeaders = mutableListOf("жена", "подруга", "подруга"),
        closeFriendsNames = mutableListOf("userName", "userName", "userName"),
        mobilePhone = "89999994242",
        homePhone = "89998884242",
        iCloud = "fdhjgfjhgfjhgffvjhviv",
    )

    println(contact1)
}