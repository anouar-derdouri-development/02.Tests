class Pet(
    var name: String,
    type: String
) {
    companion object {
        var counter: Int = 0
            private set

        val allowedTypes = listOf("dog", "cat", "hamster", "fish", "bird")

        public fun isAllowedType(type: String): Boolean {
            return allowedTypes.contains(type.lowercase())
        }
    }

    val number: Int

    var type: String = type
        set(value) {
            field = checkType(value)
        }

    init {
        checkType(type)

        counter++

        number = counter
    }

    private fun checkType(value: String):String {
        if (! isAllowedType(value))
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
        return "Animal N°$number: $name ($type)"
    }
}