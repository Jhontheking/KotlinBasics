package com.jesus.helloworld.sintaxis

fun main() {

    val mapOfPokemons = mutableMapOf("electric" to "Pikachu", "fire" to "Charmander")

    println(mapOfPokemons["electric"])
    mapOfPokemons["Squirtle"] = "water"
    mapOfPokemons["electric"] = "vol"

    println(mapOfPokemons["electric"])

    println(mapOfPokemons)

    println(mapOfPokemons["electric"])
    /*map es una estructura de datos mas cercana a los tipos d datos objeto como
    * los JSON y a diferencia de las listas no son datos indexables solo son datos
    * que se asocian a una key y esta key no puede ser repetida*/
}