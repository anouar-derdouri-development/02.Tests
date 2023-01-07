class Person constructor(
    var firstName: String,
    var lastName: String, // * The trailing comma is a best practice
    /*
        * firstName & lastName are public properties; they are accessible everywhere in the code

        * ToDo: A property can be either var or val
     */
) {
    var fullName: String = "$firstName $lastName"
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