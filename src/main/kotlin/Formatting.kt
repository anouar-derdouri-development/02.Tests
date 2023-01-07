object Formatting {
    fun titlecase(value: String): String {
        return value.substring(0, 1).uppercase() + value.substring(1).lowercase()
    }
}