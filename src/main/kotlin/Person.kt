class Person constructor(
    firstName: String = "john",
    lastName: String = "doe",
    age: Int = 18,
    /*
        * ToDo: Add private property

        * ToDo: Add val property
     */
) {
    var firstName = firstName
        set(value) {
            field = checkFirstname(value)
        }

    var lastName = lastName
        set(value) {
            field = checkLastname(value)
        }

    var age = age
        set(value) {
            field = checkAge(value)
        }

    val pets: MutableList<Pet> = mutableListOf()

    val fullName: String
        get() {
            return "$firstName $lastName"
        }

    init {
        this.firstName = checkFirstname(firstName)
        this.lastName = checkLastname(lastName)
        this.age = checkAge(age)
    }

    private fun checkFirstname(value: String): String {
        if (!value.isName())
            throw Exception("Invalid Firstname !!!")

        return value.titlecase()
    }

    private fun checkLastname(value: String): String {
        if (!value.isName())
            throw Exception("Invalid Lastname !!!")

        return value.uppercase()
    }

    private fun checkAge(value: Int): Int {
        if (!value.isAge())
            throw Exception("Invalid Age !!!")

        return value
    }

    override fun toString(): String {
        var petsToString = pets.joinToString(" ")

        return "$firstName $lastName - Pets: $petsToString"
    }
}