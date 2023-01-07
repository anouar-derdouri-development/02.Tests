fun main() {
    var p = Person("hassan", "alaoui")

//    var p = Person("7assan", "alaoui")
    // ? Exception

//        var p = Person("7assan", "3alaoui")
    // ? Exception

    p.show()

//    p.firstName = "ali"

//    p.firstName = "3ali"
    // ? Exception

//    p.firstName = "   "
    // ? Exception

    p.lastName = "hassani"

//    p.lastName = "7assani"
    // ? Exception

    p.show()
}