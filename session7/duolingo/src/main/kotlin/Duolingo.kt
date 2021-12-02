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
        //val selectedWords = words.shuffled().take(5).toMutableSet()

        println("Hoeveel woorden zou je graag willen vertalen?")
        val roundsize = readLine()
        println("Uit welke taal zou je graag willen vertalen?")
        val selectedLanguage = readLine()
        val selectedWords = words.filter { it.language == selectedLanguage}.shuffled().take(roundsize!!.toInt()).toMutableSet()



        while (selectedWords.isNotEmpty()){
        val selectedWord = selectedWords.random()
        println("Weet jij de vertaling van het woord " + selectedWord.original + "?")
        val userAnswer = readLine()

        if (selectedWord.translated == userAnswer){
            //good
            selectedWords.remove(selectedWord)
        }else{
            //bad
            println("De juist vertaling van het woord was: " + selectedWord.translated)
        }
        println("Je hebt nog " + selectedWords.count() + " woorden te vertalen")

    }
        println("Goeie! Je hebt alle woorden vertaald!")
    }

}