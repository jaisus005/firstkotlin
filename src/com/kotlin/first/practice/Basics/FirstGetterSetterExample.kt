package com.kotlin.first.practice.Basics

//it creating getter and setter
//var means --> Mutable objects
// val means -->Immutable objects
//In kotlin we don't have field all variable is considered as property

class Second(val myNumber :Int,val myString:String,var myBoolean: Boolean=false);

//In Java This Expression this be like  -->
/*
 public class Second{
  int myNumber;
  String myString;
  boolean myBoolean=false;    //we can also initilize it on constructor like in above

  public int getMyNumber(){
  return myNumber;
  }

  public void setMyNumber(int myNumber){
  this.myNumber=myNumber;
  }

  public String getMyString(){
  return myString;
  }

  public void setMyString(String myString){
  this.myString=myString;
  }

  public int getMyBoolean(){
  return myBoolean;
  }

  public void setMyBoolean(boolean myBoolean){
  this.myBoolean=myBoolean;
  }

}
*/

