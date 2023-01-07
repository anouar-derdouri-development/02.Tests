class Person constructor(firstName: String) { // * Without var or explicit var firstName is just a parameter-> it isn't a property (attribute)
    var fs: String = firstName // * fs is a property, it can be initialized using a parameter (firstName in this case)

    init {
        println("\ninit")
        println("-".repeat("init".length))

        println(firstName) // * We can use the parameter firstName in init block(s)
        println(fs) // * We can use the property fs in init block(s)
    } // * init block is triggered after the initialization of properties (like fs)

    fun show() {
        println("\nshow")
        println("-".repeat("show".length))

//        println(firsName)
        // * firstName (parameter) isn't recognised here

        println(fs) // fs (property) is recognised here + fs = this.fs
    }
}