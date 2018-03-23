package com.kotlin.first.practice.KotlinOjectOriented.Object
import com.kotlin.first.practice.KotlinOjectOriented.InterfaceKotlin

class User(override val isAdmin: Boolean,name: String, age: Int) : InterfaceKotlin {

    override fun heHasAccess(access: Boolean) {
      println("This is fun")
    }


}

fun main(args : Array<String>){
    val muUser=User(true,"Vishesh",23);
    muUser.showuserIsAdmin("Vishesh")
    muUser.heHasAccess(true)
}




