fun main() {
    var p1 = Person("imane", "soulaimani", 28)

    var a1 = Pet("boby", "dog")
    var a2 = Pet("lolo", "cat", p1)

    println("People: ")
    println(p1)

    println("\nPets of ${p1.fullName}")
    println(p1.pets)
    // * p1.pets→ Call custom getter

//    p1.pets.add(a1)
    // * we can't call add because pets is (now) immutable

    p1.addPet(a2)
    println(p1.pets)
}