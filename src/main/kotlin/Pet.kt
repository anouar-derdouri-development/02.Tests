class Pet(
    var name: String,
    type: String
) {
    companion object {
        val allowedTypes = listOf("dog", "cat", "hamster", "fish", "bird")
    }

    var type: String = type
        set(value) {
            field = checkType(value)
        }

    init {
        checkType(type)
    }

    private fun checkType(value: String):String {
        if (value.lowercase() !in allowedTypes)
            throw Exception("Invalid pet type ($value) !!!")

        return value
    }

    constructor(
        name: String,
        type: String,
        owner: Person?
    ) : this(name, type) {
        if (owner != null) {
            owner.addPet(this)
        }
        // ToDo: Explore Null safety options
    }

    override fun toString(): String {
        return "$name ($type)"
    }
}