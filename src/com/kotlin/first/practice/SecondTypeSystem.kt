package com.kotlin.first.practice

fun main(args : Array<String>){

    //type of declaration in Immutable  & Muttable variable
    val myNumber1 :Int=123;
    val myNumber2=423;
    val myNumber3 :Float;

    var myString : String="hey there";
    var myString2: String;
    var myCharacters: CharSequence="hey how are you"

    //dont forget to initilize variable before try to use it
    //     println(myNumber1+myNumber2+myNumber3);     ---> this line causes an error

    myNumber3=1243F;    //we can also declare it later
                        // if we try to change  myNumber3=344F;  it's don't work becasue val is immutable in kotlin
    println(myNumber1+myNumber2+myNumber3);  // now its working

    myString2="hey there";  //in var case we can reassign the value like myString ="no" it change myString value

    println(myString+myString2+myCharacters);

}