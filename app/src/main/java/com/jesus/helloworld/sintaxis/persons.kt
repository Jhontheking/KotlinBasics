package com.jesus.helloworld.sintaxis

class Persons(val name: String, val lastname: String, var age: Int, private var status : StatusPerson) {

    fun getStatus(){
        println(status)
    }
}