package com.example.kotlin_basics

fun main() {
    var num : IntArray = intArrayOf(1,2,3,4,5,6)
      // print(num)                 // <-prints the address of the array
    print(num.size) // prints the size of the array
     /* print("The initial values are${num.contentToString()}")   // <-prints the array. Contenttostring() converts the value to string
    for (number in num) {
        print("The values are ${num.contentToString()}")
        break
    }

    num[0] = 6
    num[1] = 5
    num[4] = 4
    num[5] = 1
    print("\n The final value are ${num.contentToString()}")
      */
}