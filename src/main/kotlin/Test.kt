fun main() {
    var p = Person("hassan", "alaoui")

//    var p = Person("7assan", "alaoui")
    // ? Exception

    p.show()

    p.firstName = "ali"

//    p.firstName = "3ali"
    // ? Exception

//    p.firstName = "   "
    // ? Exception

    p.lastName = "hassani"
    p.show()


}