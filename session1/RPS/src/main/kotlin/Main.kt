fun main () {

    rps()
}

fun greet (name: String){
    println("hello $name")
}

fun rps (){

    //array
    val choices = arrayOf<String>("rock", "paper", "scissors")

    //computers choice
    val computerChoice = choices.random()

    //player input
    print("choose any of the following: rock, paper or scissors?: ")
    val playerInput = readLine()!!

    //result
    val result: String

    if (playerInput == computerChoice) result = "tie"
    else if (playerInput == "rock" && computerChoice == "scissors") result = "you win"
    else if (playerInput == "paper" && computerChoice == "rock") result = "you win"
    else if (playerInput == "scissors" && computerChoice == "paper") result = "you win"
    else result = "you lose"

    println("You chose $playerInput and the computer chose $computerChoice, so $result")



}
