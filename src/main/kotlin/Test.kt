fun main() {
    var p = Person("hassan", "alaoui")

    p.show()
    println("Fullname: ${p.fullName}")
    /*
        ? prints: hassan alaoui
        ? not: Hassan ALAOUI

        ToDo: Initialize fullName the way we want OR Add custom getter
    */

    p.firstName = "hamid"
    p.lastName = "hassani"
    p.show()
    /*
        ? "hamid" & "hassani" will stay "hamid" & "hassani"
        ? not "Hamid" & "HASSANI" (like init block)

        ToDo: Add custom setters or getters
    */

    println("Fullname: ${p.fullName}")
    /*
        ? "hassan alaoui"
        ? not "Hamid HASSANI" or even "hamid hassani"

        ToDo: Add custom getter for fullName
    */
}