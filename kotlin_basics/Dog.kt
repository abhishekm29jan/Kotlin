package com.example.kotlin_basics

class Dog (var name: String, var breed: String, val age: Int){
    init {
        bark()
    }

    fun bark() {
       println("$name says Woof Woof!!")
       println("$name is a $breed")
    }
}