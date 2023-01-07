fun main() {
    println("Allowed pet types: ${Pet.allowedTypes}")

    var a1 = Pet("boby", "dog")
    println(a1)

//    var a2 = Pet("loli", "kitten")
    // ? Exception: kitten isn't allowed

    var a3 = Pet("chocho", "fish")
//    a3.type = "goldfish"
    // ? Exception: goldfish isn't allowed

}