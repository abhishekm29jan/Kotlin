package com.example.kotlin_basics

fun main() {
   var mybook = Books("Harry Potter", "JK Rowling", 2012)
   println("${mybook.title} is written by ${mybook.author} published on ${mybook.yearpublished}")
}