package com.example.kotlin_basics

fun main() {
    val myarraylist : ArrayList<Int> = ArrayList()
    myarraylist.add(6)
    myarraylist.add(12)
    myarraylist.add(18)
    myarraylist.add(24)
    myarraylist.add(40)
    var total = 0
    for (i in myarraylist) {
        total+= i
    }
    print("Total is:" +total)
    val avg = total / myarraylist.size
    println("\n Average is:" +avg)

}