package com.example.kotlin_basics

fun main() {
    var playerchoice = ""
    var compchoice= ""
    print("Rock Paper Scissor? Enter your choice:")
    playerchoice = readln()

    var random_no = (1..3).random()
    when (random_no) {
        1 -> compchoice = "Rock"
        2 -> compchoice = "Paper"
        3 -> compchoice = "Scissor"
        else -> "Invalid"
    }
    println(compchoice)

    var winner =  when {
        playerchoice ==  compchoice -> "Tie"
        playerchoice == "Paper" && compchoice == "Rock"-> "Player"
        playerchoice == "Scissor" && compchoice == "Paper" -> "Player"
        playerchoice == "Rock" && compchoice == "Scissor" -> "Player"
        else ->"Computer"
    }
    if (winner == "Tie") {
        println("It is a tie")
    }else println("$winner wins")
}