fun main() {
    val str = readln()
    str
        .replaceAfterLast(
            "u",
            str
                .substringAfterLast("u")
                .uppercase()
        )
        .let(::println)
}