package com.kotlin.first.practice.ControlFlow

fun main(args: Array<String>) {
    //do and do while work same in kotlin like they work in java
//--------------------do-while---------------------//
    var doNo = 20;
    do {
        println("Hey This is my Do Time "+doNo)
       doNo+=10;
    } while (doNo < 20)


//---------------------while-------------------------//
  var whileNo=20;

    while(whileNo <20){
        println("Hey this is  my While Time "+whileNo)
        whileNo+=10;
    }

// ------------------for loop behave little different in kotlin they remove its complexity-------------------------------------//
  //range check example
    for (no in 1..10){
        println("Print For "+no);
    }

   //string example
    for(ch in "Buiscuit"){
        println(ch);
    }

}