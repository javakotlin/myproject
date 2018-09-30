package com.tom

fun main(args: Array<String>) {
//    println("Hello kotlin")
//    Human().hello()
    val h = Human()
    h.hello()
    var age : Int = 25;
    age = age.plus(1)
    val weight = 65.5
    val enroll : Boolean = true
    println(age)
}

class Human {
    fun hello() {
        println("Hello kotlin")
    }
}