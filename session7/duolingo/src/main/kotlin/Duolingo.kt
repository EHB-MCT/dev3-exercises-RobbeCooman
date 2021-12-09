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
        EnglishWord("bird", 1,"vogel"),
        FrenchWord("table",1 ,"tafel"),
        EnglishWord("street",1, "straat"),
        FrenchWord("chaise", 2,"stoel"),
        FrenchWord("carte",1 ,"kaart"),
        EnglishWord("plane", 2,"vliegtuig"),
        EnglishWord("tree",1 ,"boom"),
        FrenchWord("ordinateur",2 ,"computer"),
        FrenchWord("souris",2 ,"muis"),
        EnglishWord("keyboard", 2,"toetsenbord")
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
                if (selectedWord.difficulty > 1) {
                    selectedWord.difficulty--
                } else {
                    throw Exception("The difficulty cant be smaller then 1")
                }
            } else {
                println("Het juiste antwoord was ${selectedWord.translated}")
                selectedWord.difficulty+=2
            }

            println("Je moet nog ${randomWords.count()} woorden oplossen")
        }

    }
}