fun isName(value: String): Boolean {
    return !(value.isBlank() || value.contains("[0-9]".toRegex()))
}

fun isAge(value: Int): Boolean {
    return (value >= 18)
}

fun titlecase(value: String): String {
    return value.substring(0, 1).uppercase() + value.substring(1).lowercase()
}