class Person constructor(
    firstName: String,
    lastName: String,
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

    val fullName: String
        get() {
            return "$firstName $lastName"
        }

    init {
        println("\ninit")
        println("-".repeat("init".length))

        this.firstName = checkFirstname(firstName)
        this.lastName = checkLastname(lastName)

        println("${this.firstName} ${this.lastName}")
    }

    private fun checkFirstname(value: String): String {
        if (!Validation.isName(value))
            throw Exception("Invalid Firstname !!!")

        return Formatting.titlecase(value)
    }

    private fun checkLastname(value: String): String {
        if (!Validation.isName(value))
            throw Exception("Invalid Lastname !!!")

        return value.uppercase()
    }

    fun show() {
        println("\nshow")
        println("-".repeat("show".length))

        println("$firstName $lastName")
    }
}