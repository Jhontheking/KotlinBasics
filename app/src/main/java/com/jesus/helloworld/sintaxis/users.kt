package com.jesus.helloworld.sintaxis

fun main() {
    val user1 = Persons(
        "Jesus David",
        "Contreras Escalona",
        28,
        StatusPerson.Single
    )

    user1.getStatus()
}