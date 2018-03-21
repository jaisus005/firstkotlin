package com.kotlin.first.practice

//In kotlin "When expression replaces classic switch statement
//when has two forms 1->with argument 2-> without argument
fun main(args: Array<String>) {
//------------------------------------ with argument examples-------------------------------------------------------------//

    //--------Simple argument example----------------//
    var myValue = 3;
    var status = when (myValue) {

        0 -> "I'am Exausted"
        1, 3 -> "Not at all"      //here we can show same result in two cases 1,3 if any of them is true "Not at all" run
        2 -> "Too Exausted"
        else -> "Let see"
    }
    println(status);

    //--------Change variable Comparing Argument example where no need  stick to constant-----------//
    when (myValue) {

        Math.abs(myValue) -> println("Exhaustion is on progress") //it comparing the statements if myValue is is like -1 then  else will run
        else -> println("Lets see what happen");
    }


    //---------- Range Arguments example Where we set the range of variables--------------------//
  when(myValue){

      in 0..2 -> println("hell of show !!");
      in 2..3-> println("exhaustion is overlimit");
      in  3..7-> println("I am Bursted");
  }

    //------------------------------------ without argument examples-------------------------------------------------------------//

    when{
        myValue <=0 -> println("Not Exhausted")
        myValue %2 ==1-> println("Oddly Exhausted")
        myValue %2 ==0 -> println("Evenly Exhausted");
    }
    //as you can see above we don't pass any args in when instead e simply compare and then run expected result


}