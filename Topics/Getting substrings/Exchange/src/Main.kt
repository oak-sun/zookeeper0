fun main() = readln().let {
    print(
        it.last() +
            it.substring(1, it.lastIndex) +
            it.first()
    )
}
