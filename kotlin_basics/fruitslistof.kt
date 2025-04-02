package com.example.kotlin_basics

fun main() {
    val fruits = mutableListOf("Apple", "Banana", "Mango", "Orange", "Grapes")
//    println(fruits.add(3, "Pineapple"))
//    print(fruits.remove("Banana"))
//    print(fruits.removeAt(3))
    print(fruits.set(4, "Watermelon"))
    if (fruits.contains("Mango")) {
        print("I love mangoes")
    } else print("I want mangoes")
}