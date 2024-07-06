package com.example.firstapplication.kotlinegs
import com.example.firstapplication.kotkinexs.Student
import com.example.firstapplication.kotkinexs.Employee

//fun main() {
//    println("hello world")
//    var myStudent: Student = Student(name = "Prateek", age = 20, address = "Bangalore")
//    println("My name is " + myStudent.name)
//    myStudent.name = "PrateekG"
//    println("New name is " + myStudent.name)
//
//    var myEmployee: Employee = Employee("PrateekGanni", 20, "Hyderabad")
//    println("Employee name is " + myEmployee.getName())
//}
/*var someLamda : (Int,Int) -> Int = {a:Int,b:Int -> a+b}
    println(someLamda(10,20))
    var otherLamda : (Int,Int,String) -> Int = {a:Int,b:Int,msg:String -> println(msg) a+b}
}*/

var lamda : (Int) -> Int = { a -> a*a}

fun operation(): (Int) -> Int {
    //return lamda
    return ::square
    }
fun square(x: Int) = x * x
fun main() {
        val func = operation()
    println(func(2))
}