package com.example.kotlin_basics

fun main() {
    val shoppinglist = mutableListOf("Chips","Chocolate","Cold Drinks","Biscuits","Soap","Dress")
//    for (item in shoppinglist) {
//        println(item)
//        if (item == "Biscuits") {
//            shoppinglist.removeAt(5)
//            break
//        }
//    }
    for (index in 0 until shoppinglist.size) {
        println("${shoppinglist[index]} is present at the index $index") // Array representation
    }
}