class Comedian(override val name: String): Person(name) {

    override fun talk(){
        tellJoke()
    }

    fun tellJoke(){
        println("I'm very funny, hahaha")
    }


}