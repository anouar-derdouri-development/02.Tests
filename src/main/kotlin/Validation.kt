object Validation {
    fun isName(value: String): Boolean {
        return !(value.isBlank() || value.contains("[0-9]".toRegex()))
    }

    fun isAge(value: Int): Boolean {
        return (value >= 18)
    }
}