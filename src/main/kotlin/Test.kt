fun main() {
    var p = Person("hassan", "alaoui")

    p.show()
    println("Fullname: ${p.fullName}")// * Call the custom getter
//    p.fullName = ""
    // ? Doesn't work because the setter is private

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
        ? "hamid hassani"
        ? not "Hamid HASSANI"
    */
}