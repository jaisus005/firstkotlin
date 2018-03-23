package com.kotlin.first.practice.Functions

fun main(args: Array<String>) {
    println(myFunction1(10, 20))
    println(myFunction2(10, 20))
    println(myDefaultFuntion())
    println(myDefaultFuntion(10, 20))
    println(myDefaultFuntion(message = "This is going to be fun"))
}

//in kotlin function reffered as fun keyword we pass parameter as we know every thing in kotlin as a property
// :Int use it return type
fun myFunction1(param1: Int, param2: Int): Int {
    return param1 + param2
}

//as we know both param is integer in kotlin so we don;t need to specify retun type as integer (:Int)
fun myFunction2(param1: Int, param2: Int) = param1 + param2

//we can also provide default values to funtion it prevent method overriding most of cases
fun myDefaultFuntion(param1: Int = 10, param2: Int = 20, message: String = "Hey There "): Int {
    println(message)
    return param1 + param2;
}