fun main() {
    var p1 = Person()

    var p2 = Person(firstName = "jane")

    var p3 = Person(firstName = "hassan", lastName = "alaoui")

    var p4 = Person(firstName = "hamid", "hassani")

//    var p5 = Person(lastName = "hamid", "hassani")
    // ? Exception

    println()
    println(p1)
    println(p2)
    println(p3)
    println(p4)
}