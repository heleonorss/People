fun main() {
    while (true) {
        var likes = readLine()?.toUInt() ?: return
        val likesSum = (likes - 1U)

        if (likesSum % 10U == 0U) {
            print("Понравилось $likes человеку")
        } else print("Понравилось $likes людям")
    }
    }