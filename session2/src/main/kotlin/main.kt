import kotlin.random.Random
import kotlin.test.assertContentEquals

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
        challengeTwo()
    }else {
        gameOver()
    }
}

fun challengeTwo(){
    val diceResult = (1..6).random()
    val userAnswer = readLine()
    var acceptedAnswers = setOf<Int>()

    if (userAnswer == "low") {
        acceptedAnswers = setOf(1, 2, 3)
    }else{
           acceptedAnswers = setOf(4, 5, 6)
        }

    if (acceptedAnswers.contains(diceResult)){
        challengeThree()
    }else{
        gameOver()
    }
}

fun challengeThree(){
    val answers = setOf<String>("shovel", "Stone", "Sword")

    val playerInput = readLine()

    if (answers.contains(playerInput)){
        challengeTwo()
    }else {
        gameOver()
    }

}




fun win(){
    println("congrats")
}

fun gameOver(){
    print("you are eaten by a giraffe")
}



