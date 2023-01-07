import java.text.Normalizer.Form

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
            if (! Validation.isName(value))
                throw Exception("Invalid Firstname !!!")

            field = Formatting.titlecase(value)
        }

    var lastName = lastName
        set(value) {
            if (! Validation.isName(value))
                throw Exception("Invalid Lastname !!!")

            field = value.uppercase()
        }

    val fullName: String
        get() {
            return "$firstName $lastName"
        }

    init {
        println("\ninit")
        println("-".repeat("init".length))

        if (! Validation.isName(firstName))
            throw Exception("Invalid Firstname !!!")
        this.firstName = Formatting.titlecase(firstName)

        if (! Validation.isName(lastName))
            throw Exception("Invalid Lastname !!!")
        this.lastName = this.lastName.uppercase()

        println("${this.firstName} ${this.lastName}")
    }

    fun show() {
        println("\nshow")
        println("-".repeat("show".length))

        println("$firstName $lastName")
    }
}