fun main() {
    var p = Person("hassan", "alaoui")

    p.show()
    println("Fullname: ${p.fullName}")

    p.firstName = "hamid"
    p.lastName = "hassani"
    p.show()
    println("Fullname: ${p.fullName}")
    println("Fullname: ${p.firstName} ${p.lastName}") // * Call default getters
}