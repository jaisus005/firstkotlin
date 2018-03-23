package com.kotlin.first.practice.KotlinOjectOriented.Object

import com.kotlin.first.practice.KotlinOjectOriented.Class.Person


fun main(args: Array<String>) {
//------------In Kotlin Object behave little different or work like combination of Javascript  or  Java-----------//

//-------traditionally we use in java  like-------------//
    val person=Person("Vishesh","Pandey")
    person.showMe("hell")

//------like java script--------------//
    val scriptFunction=object {
        var firstName :String ="Vishesh"
        var lastName :String ="Pandey"
        fun myMethod(){
        println("${firstName}  ${lastName}")
        }
    }

    scriptFunction.myMethod()
}

