fun String.isName(): Boolean {
    return !(this.isBlank() || this.contains("[0-9]".toRegex()))
}

fun Int.isAge(): Boolean {
    return (this >= 18)
}

fun String.titlecase(): String {
    return this.substring(0, 1).uppercase() + this.substring(1).lowercase()
}