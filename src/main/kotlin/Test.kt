fun main() {
    var p = Person("hassan", "alaoui")

    p.show()
    println("Fullname: ${p.fullName}")

    p.firstName = "hamid"
    p.lastName = "hassani"
    p.show()
    println("Fullname: ${p.fullName}")
}