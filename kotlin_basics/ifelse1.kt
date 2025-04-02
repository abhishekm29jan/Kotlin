package com.example.kotlin_basics

fun main() {
    println("Enter your age:")
    var myage = readln().toInt()
    if (myage < 18) {
        println("You are a minor")
    } else if (myage >= 18 && myage<=30) {
        println("You are an adult")
    } else if (myage > 30 && myage<= 40 ) {
        println("You are getting old")
    }else println("You are a senior citizen")
}