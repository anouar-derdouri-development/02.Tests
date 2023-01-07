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
            field = Formatting.titlecase(value)
        }

    var lastName = lastName
        set(value) {
            field = value.uppercase()
        }

    val fullName: String
        get() {
            return "$firstName $lastName"
        }

    init {
        println("\ninit")
        println("-".repeat("init".length))

        this.firstName = Formatting.titlecase(firstName)
        this.lastName = this.lastName.uppercase()

        println("${this.firstName} ${this.lastName}")
    }

    fun show() {
        println("\nshow")
        println("-".repeat("show".length))

        println("$firstName $lastName")
    }
}