package com.example.kotlin_basics

fun main () {
    val fruits = setOf("Apple", "Mango", "Banana", "Grapes", "Oranges") //this is a immutable set
    // print(fruits.size)
    // print(fruits.toSortedSet())  // prints the set in ascending order
    val newfruits = fruits.toMutableSet()
    newfruits.add("Guava")  // can add only one element
    print(newfruits.toSortedSet())
}