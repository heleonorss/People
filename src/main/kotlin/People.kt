fun main() {
    while (true) {
        var likes = readLine()?.toUInt() ?: return
        val endingOfTheWord = if (likes == 11U || likes % 100U == 11U || likes % 10U != 1U) "людям" else "человеку"
        println("Понравилось $likes $endingOfTheWord")

    }
    }