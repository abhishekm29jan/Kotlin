package com.example.kotlin_basics

fun main() {
    val months = listOf("Jan", "Feb", "March","April","May")
    // println(months)
    //print(months.size)
    val newmonth = months.toMutableList()
    var additionalmonth = arrayOf("June", "July", "August")
    newmonth.addAll(additionalmonth)
    println(newmonth)
}