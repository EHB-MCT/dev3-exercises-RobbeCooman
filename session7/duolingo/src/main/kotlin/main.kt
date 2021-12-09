fun main (){

    println("Wich language do you want to practice?")
    val answer = readLine().toString()
    if(answer == "English" || answer == "French")  {
        val Duolingo = Duolingo(5,"${answer}")
        Duolingo.play()
    } else  {
        throw Exception("You can only chosse between 'English' or 'French'")
    }





}