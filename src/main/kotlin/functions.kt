val isName = { value: String -> !(value.isBlank() || value.contains("[0-9]".toRegex())) }
// * Another alternative
//val isName:(String) -> Boolean = { value: String -> !(value.isBlank() || value.contains("[0-9]".toRegex())) }

val isAge = { value: Int -> (value >= 18) }

val titlecase = {value: String -> value.substring(0, 1).uppercase() + value.substring(1).lowercase()
}