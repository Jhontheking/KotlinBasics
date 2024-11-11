package com.jesus.helloworld.sintaxis

fun main() {
    /*If the module of a mathematical operation is 0, the number is even*/
    var numb1 = readln().toInt()
    var numb2 = readln().toInt()

    var solved = numb1 % numb2
    if (solved == 0){
        println("the number is even")
    }else{
        println("the number is odd")
    }

}