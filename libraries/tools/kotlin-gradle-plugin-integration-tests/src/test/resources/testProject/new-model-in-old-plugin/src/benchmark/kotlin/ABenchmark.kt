package com.example

fun main() {
    val a = A()
    val f = a::f
    internalFun()
    f()
    println("${a::f.name} ran at the speed of light")
}