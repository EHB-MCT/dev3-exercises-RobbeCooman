fun main() {

challengeOne()

}

fun challengeOne(){
    //player input
    println("Welkom bij deze leuk game")
    println("Can you name one of the big five animals?")

    val answers = setOf<String>("Lion", "Rhino", "Elephant", "Buffalo", "Leopard")

    val playerInput = readLine()

    if (answers.contains(playerInput)){
        win()
    }else {
        gameOver()
    }
}

fun win(){
    println("Congrats")
}

fun gameOver(){
    println("you are eaten by a giraffe")
}