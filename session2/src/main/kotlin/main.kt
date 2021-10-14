import kotlin.random.Random

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
    challengeTwo()
}

fun gameOver(){
    println("you are eaten by a giraffe")
}

fun challengeTwo(){
println("Next challenge! The computer will generate a random number, is it gonna be low (1-3) or high (4-6)?")
println(rollDice())
}

fun rollDice(){
    val randomNumber = Random.nextInt(6)

}