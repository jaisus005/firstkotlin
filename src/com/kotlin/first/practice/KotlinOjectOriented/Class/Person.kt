package com.kotlin.first.practice.KotlinOjectOriented.Class

//in kotlin classes have one primary constructor or one or more secondary constructor
class Person
//primary constructor
internal constructor(firstName:String,lastName:String){
    init {
        println("Person Name is ${firstName} ${lastName}");
    }

    //secondary constructor
   constructor(firstName:String,middleName:String,lastName:String):this(firstName, lastName) {
           println("Person Name is ${firstName} ${middleName} ${lastName}")
   }

    fun showMe(name :String){
        println("Hey There Its Me " +name);
    }
}