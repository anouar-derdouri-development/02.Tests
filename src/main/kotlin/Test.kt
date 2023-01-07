fun main() {
    var p1 = Person("imane", "soulaimani", 28)

    var a1 = Pet("boby", "dog")
    var a2 = Pet("lolo", "cat", p1)

    println("Pets:")
    println(a1)
    println(a2)

    println()

    println("People: ")
    println(p1)
}