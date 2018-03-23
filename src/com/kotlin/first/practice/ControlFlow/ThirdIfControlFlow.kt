package com.kotlin.first.practice.ControlFlow

fun main(args: Array<String>) {

    // In kotlin If clause is considered as a expression that can return a value
    // and we don't need to declare return statement
    var temp = 120;
    var statusTemp: String = if (temp < 140) "Temp is too low" else "Temp is too high"
    println(statusTemp);

    val isTempHigh = if (temp > 140) {
        println("Yes its too high");

    } else {
        println("Naah its Not Too High")
    }

    println("Status of Temp is High :"+isTempHigh.toString())
    //in this line we can see isTempHgh has kotlin.Unit so it prevent null pointer exception
}