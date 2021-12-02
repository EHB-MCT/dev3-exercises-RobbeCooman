class Duolingo (){

    val words= setOf<Word>(
        Word("bird", "vogel", "English"),
        Word("street", "straat", "English"),
        Word("tree", "boom", "English"),
        Word("plane", "vliegtuig", "English"),
        Word("keyboard", "toetsenbord", "English"),
        Word("table", "tafel", "French"),
        Word("chaise", "stoel", "French"),
        Word("carte", "kaart", "French"),
        Word("ordinateur", "computer", "French"),
        Word("souris", "muis", "French")
    )

    fun play(){
        val selectedWords = words.shuffled().take(5).toMutableSet()

        while (selectedWords.isNotEmpty()){
        val selectedWord = selectedWords.random()
        println("weet jij de vertaling van " + selectedWord.original)
        val userAnswer = readLine()

        if (selectedWord.translated == userAnswer){
            //good
            selectedWords.remove(selectedWord)
        }else{
            //bad
            println("dit was de juiste vertaling " + selectedWord.translated)
        }
        println("you still have " + selectedWords.count() + " words to do")

    }
        println("goeie!")
    }

}