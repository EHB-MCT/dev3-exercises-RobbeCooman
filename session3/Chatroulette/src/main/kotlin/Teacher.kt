class Teacher (override val name: String): Person(name) {

    override fun talk(){
        funFact()
    }

    fun funFact(){
    println("did you know Kotlin was named after an island?")
    }
}