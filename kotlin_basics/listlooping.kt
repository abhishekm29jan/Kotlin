package com.example.kotlin_basics

fun main() {
    val numbers = mutableListOf(1, 2, 3, 4, 5)
    for (items in 0 until numbers.size) {
        numbers[items] = numbers[items]*2
    }
    println(numbers)
}