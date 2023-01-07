class Pet(
    var name: String,
    var type: String
) {
    constructor(
        name: String,
        type: String,
        owner: Person?
    ) : this(name, type) {
        if (owner != null) {
//            owner.pets.add(this)
            // * Doesn't work anymore, because pets is List... (immutable)

            owner.addPet(this)
        }

        // ToDo: Explore Null safety options
    }

    override fun toString(): String {
        return "$name ($type)"
    }
}