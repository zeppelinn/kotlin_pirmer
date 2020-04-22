package com.lijun.kotlin

fun main() {
    runBlock {
        List(1000){
            println("Hello World")
        }
    }
}

fun runBlock(block: ()-> Unit) {
    val start = System.currentTimeMillis()
    block()
    println(System.currentTimeMillis() - start)
}