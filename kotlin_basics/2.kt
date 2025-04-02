package com.example.kotlin_basics

fun main() {
    var numbers = listOf(1, 2, 3)
    val double = numbers.map { it  * 3 }
    print(double)
}