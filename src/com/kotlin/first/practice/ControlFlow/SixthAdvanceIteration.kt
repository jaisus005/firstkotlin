package com.kotlin.first.practice.ControlFlow

fun main(args: Array<String>) {

//---------------custom indexing -------------------//
    var idx = 0;
    for (items in 10.rangeTo(20).step(2)) {
        print("${items} Item in Index of (${++idx})")
    }
    println();
//----------------auto indexing--------------------//
    for ((index, item) in 10.rangeTo(20).step(2).withIndex()) {
        print("${index} Item is ${item}   ")
    }
    println()

//----------------------array iteration------------------------------//
    var myArray= arrayOf('a','b','c','d','e','f','g');
    for (item in myArray.indices){
        print("At  ${item} Position Value is \"${myArray[item]}\"  ")
    }

}