package com.example.kotlin_basics

fun main () {
//    println("Enter num1:")
//    val numb1= readln().toInt()
//    println("Enter num2:")
//    val numb2= readln().toInt()
//    var result = add(numb1,numb2)
    println("Enter num1:")
    val numb1= readln().toDouble()
    println("Enter num2:")
    val numb2= readln().toDouble()
    //var result = add(numb1,numb2)
    var result1 = divide(numb1,numb2)
//    println("The result is $result")
    println("The result is $result1")

}

fun add(num1: Int, num2: Int): Int {  // Function having a return type that returns a value to the main function
    val result = num1+num2
    return result
}

fun divide(num1: Double, num2: Double): Double {  // Function having a return type that returns a value to the main function
    val result1 = num1/num2
    return result1
}

fun addDetails() {
    // Function call
//    makecoffee(1, "Aditi")
//    makecoffee(2, "Lucky")
//    makecoffee(3, "Jaadu")
    println("Who is this coffee for?:")
    val name = readln()
    println("How many sugar do you need?")
    val sugarcount = readln()
    val sugarcounttoint = sugarcount.toInt()
    makecoffee(sugarcounttoint, name)
}

// Function Define
fun makecoffee(sugarcount: Int, name: String){
    if (sugarcount == 1) {
        println("Coffee with $sugarcount spoon of sugar for $name")
    }
    else println("Coffee with $sugarcount spoons of sugar for $name")
}