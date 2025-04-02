package com.example.kotlin_basics

class Books (var title: String, var author: String, val yearpublished: Int) {
    init {
        mybooks()
    }
    fun mybooks() {
     //   println("$title is by $author on $yearpublished")
    }
}