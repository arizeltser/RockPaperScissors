package com.example.rockpaperscissors

fun main() {
    var computerChoice = ""
    var playerChoice = ""
    println("Enter R P or S")
    playerChoice = readln()
    while(playerChoice.lowercase() != "r" && playerChoice != "p" && playerChoice != "s") {
        println("improper input, try again")
        playerChoice = readln()
    }

    val randomNumber = (1..3).random()
    when(randomNumber) {
        1 -> computerChoice = "rock"
        2 -> computerChoice = "paper"
        3 -> computerChoice = "scissors"
    }

    println(playerChoice)
    println(computerChoice)

    val winner = when {
        playerChoice == computerChoice.substring(0,1).lowercase() -> "Tie"
        playerChoice == "R" && computerChoice == "scissors" -> "Player"
        playerChoice == "P" && computerChoice == "rock" -> "Player"
        playerChoice == "S" && computerChoice == "paper" -> "Player"
        else -> "Computer"

    }
    if (winner == "Tie") {
        println("Its a Tie")
    }
    else {
        println("$winner Wins")
    }

}