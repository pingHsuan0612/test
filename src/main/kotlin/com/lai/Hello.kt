package com.lai

fun main() {
//    println("HELLO KOTLIN")
//    Human().hello()
    val h=Human()
    h.hello()
    h.hello2()
}

class Human{
    fun  hello(){
        println("Hello KOTLIN")
    }
    fun hello2(){
        println("111222")
    }
}