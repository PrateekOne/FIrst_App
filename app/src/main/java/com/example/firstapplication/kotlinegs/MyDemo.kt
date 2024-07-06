package com.example.firstapplication.kotlinegs

import com.example.firstapplication.kotkinexs.Student
import com.example.firstapplication.kotkinexs.Employee

fun main() {
    var someLambda: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
    var someLambda2: (Int, Int) -> Int = ::add
    println(someLambda2(40, 50))

    var lambda1: (Int, Int, String) -> Int = { a, b, c ->
        println("message is $c")
        a * b
    }
    println(lambda1(5, 6, "welcome"))

    println(someLambda(10, 20))
}

var lambda: (Int) -> Int = { a -> a * a }

fun operation(): (Int) -> Int {
    return ::square
}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun square(x: Int) = x * x

/*
fun main() {
    val func = operation()
    println(func(2))
}
*/
