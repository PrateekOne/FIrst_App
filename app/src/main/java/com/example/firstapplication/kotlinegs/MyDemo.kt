package com.example.firstapplication.kotlinegs
import com.example.firstapplication.kotkinexs.Student
import com.example.firstapplication.kotkinexs.Employee

fun main() {
    println("hello world")
    var myStudent: Student = Student(name = "Prateek", age = 20, address = "Bangalore")
    println("My name is " + myStudent.name)
    myStudent.name = "PrateekG"
    println("New name is " + myStudent.name)

    var myEmployee: Employee = Employee("PrateekGanni", 20, "Hyderabad")
    println("Employee name is " + myEmployee.getName())
}
