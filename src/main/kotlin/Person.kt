class Person constructor(
    var firstName: String,
    var lastName: String,
    /*
        * ToDo: Add private property

        * ToDo: Add val property
     */
) {
    var fullName: String = "$firstName $lastName"
        /*
            * We can initialize fullName in init block
        */
        get() {
            return "$firstName $lastName"
        }
        private set

    init {
        println("\ninit")
        println("-".repeat("init".length))

        firstName = firstName.substring(0, 1).uppercase() + firstName.substring(1).lowercase()
        lastName = lastName.uppercase()

        println("$firstName $lastName")
    }

    fun show() {
        println("\nshow")
        println("-".repeat("show".length))

        println("$firstName $lastName")
    }
}