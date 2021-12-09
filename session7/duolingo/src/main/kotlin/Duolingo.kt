class Duolingo (val size: Int = 5, val language: String="English") {

    //val words= setOf<Word>(
    //        Word("bird", "vogel", "English"),
    //        Word("street", "straat", "English"),
    //        Word("tree", "boom", "English"),
    //        Word("plane", "vliegtuig", "English"),
    //        Word("keyboard", "toetsenbord", "English"),

    //        Word("table", "tafel", "French"),
    //        Word("chaise", "stoel", "French"),
    //        Word("carte", "kaart", "French"),
    //        Word("ordinateur", "computer", "French"),
    //        Word("souris", "muis", "French")
    //)

    var words = mutableSetOf<Word>(
        EnglishWord("bird", "vogel"),
        FrenchWord("table", "tafel"),
        EnglishWord("street", "straat"),
        FrenchWord("chaise", "stoel"),
        FrenchWord("carte", "kaart"),
        EnglishWord("plane", "vliegtuig"),
        EnglishWord("tree", "boom"),
        FrenchWord("ordinateur", "computer"),
        FrenchWord("souris", "muis"),
        EnglishWord("keyboard", "toetsenbord")
    )


    init {
        words = words.filter { it.language == language }.toMutableSet()
    }


    fun play() {
        val randomWords = words.shuffled().take(size).toMutableSet()
        //.shuffled = > zodat we niet elke keer 5 dezelfde hebben
        // .take() => aantal items
        // .toMutableSet => zodat een item kan worden weggehaald

        while (randomWords.isNotEmpty()) {
            val selectedWord = randomWords.random()
            println("Vertaal dit woord: ${selectedWord.original}")
            val answer = readLine()


            if (answer == selectedWord.translated) {
                randomWords.remove(selectedWord)
            } else {
                println("Het juiste antwoord was ${selectedWord.translated}")
            }

            println("Je moet nog ${randomWords.count()} woorden oplossen")
        }

    }
}