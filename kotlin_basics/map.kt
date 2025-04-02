package com.example.kotlin_basics

fun main(){
    val daysoftheweek = mapOf(1 to "Monday" , 2 to "Tuesday", 3 to "Wednesday") // immutable map
    var newdaysoftheweek = daysoftheweek.toMutableMap()
    newdaysoftheweek[4] = "Thursday"  // it works with an index value ie the keys
    newdaysoftheweek[5] = "Friday"
    newdaysoftheweek[6] = "Saturday"
    for(keys in newdaysoftheweek.keys) {
        println("${keys} denotes ${newdaysoftheweek[keys]}")
    }
}