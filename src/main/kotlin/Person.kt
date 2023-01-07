class Person constructor(
    firstName: String,
    lastName: String,
    /*
        ? firstName & lastname are juste properties because we want to add their custom getters & setters, but we first have to add properties inside class body

        * ToDo: Add private property

        * ToDo: Add val property
     */
) {
    var firstName = firstName
        set(value) {
            field = value.substring(0, 1).uppercase() + value.substring(1).lowercase()
        }

    var lastName = lastName
        set(value) {
            field = value.uppercase()
        }

    val fullName: String // ? no need to initialize fullName because it has a getter + it has a private setter→ Convert fullName to val
        get() {
            return "$firstName $lastName"
        }

    init {
        println("\ninit")
        println("-".repeat("init".length))

        this.firstName = this.firstName.substring(0, 1).uppercase() + this.firstName.substring(1).lowercase()
        this.lastName = this.lastName.uppercase()
        /*
            ? The previous 2 lines are required (even the existence of the setters) because the primary constructor doesn't meet the setters but th init block is always executed after primary constructor call
        */

        println("${this.firstName} ${this.lastName}")
    }

    fun show() {
        println("\nshow")
        println("-".repeat("show".length))

        println("$firstName $lastName")
    }
}