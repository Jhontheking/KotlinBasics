package com.jesus.helloworld.sintaxis

sealed class StatusPerson {
    data object Single : StatusPerson()
    data object Married : StatusPerson()
    data object Divorced : StatusPerson()
}