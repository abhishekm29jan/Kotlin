package com.example.kotlin_basics

fun main (){
    println("Enter your age:")
    val enteredage = readln()  // readln takes the input from the user
    val age = enteredage.toInt() // toInt coverts the input into integer
    if (age< 18){
        println("You are a kid")
    }
    else if (age>= 18){
        println("You are an adult")
    }
    else if (age >= 40) {
        println("You are old")
    }
    else {
        println("You are a senior citizen")
    }
}