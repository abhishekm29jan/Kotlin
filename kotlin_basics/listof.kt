package com.example.kotlin_basics

fun main() {
//    val shoppinglist = listOf("Chips","Chocolate","Cold Drinks","Biscuits","Soap","Dress") //Immutable
//    println(shoppinglist)
    //We can modify this list according to the need
    val shoppinglist = mutableListOf("Chips","Chocolate","Cold Drinks","Biscuits","Soap","Dress")
    shoppinglist.add("Ice cream")                     //specific item has been added at the end of the array
    shoppinglist.add(2,"Horlicks")                    //items are added at a definite index
    println(shoppinglist)
    shoppinglist.remove("Chips")                      // specific items are removed from the list
    shoppinglist.removeAt(3)                          // items are removed from specific index
    println(shoppinglist)
    shoppinglist[3] = "Detergent"
    println(shoppinglist[3])
    shoppinglist.set(1,"Laptop")                      //set method sets a new item at a particular index
    println(shoppinglist)
    if (shoppinglist.contains("Horlicks")){
        println("It has horlicks in the list")
    } else {
        println("It doesnot have horlicks in the list")
    }

}