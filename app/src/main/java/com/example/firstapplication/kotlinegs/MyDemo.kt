package com.example.firstapplication.kotlinegs
import com.example.firstapplication.kotkinexs.Student
import com.example.firstapplication.kotkinexs.Employee

fun main() {
    var someLamda : (Int,Int) -> Int = {a:Int,b:Int -> a+b}
    var someLamda2 : (Int,Int) -> Int = ::add
    println(someLamda2(40,50))

    var lamda1:(Int,Int,String)->Int =
        {
                a,b,c ->
            println("message is "+c)
            a*b
        }
    println(lamda1(5,6,"welcome"))

    println(someLamda(10,20))
}

var lamda : (Int) -> Int = { a -> a*a}

@@ -16,9 +27,15 @@ fun operation(): (Int) -> Int {                                     // 1
    return ::square
}

fun  add(a:Int,b:Int):Int{
    return a+b
}


fun square(x: Int) = x * x                                          // 2

/*
fun main() {
    val func = operation()                                          // 3
    println(func(2))                                                // 4
}*/