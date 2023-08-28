package com.franzandel.ilt1

abstract class Animal {
    abstract val age: Int //must be overridden

    //initial value
    open val isEating = true //not must be overridden
    val isRespire = true //can not be overridden
}

interface IWalk {
    val numberOfLeg: Int
    fun walk()
}

class Camel : Animal(), IWalk {
    override val age: Int = 7   // this property must exist, try to remove it
    override val isEating = true // this property optional, try to remove it
    override val numberOfLeg = 2
    override fun walk() {
        println("Camel can walk")
    }
}

fun main() {
    val camel = Camel()
    camel.walk()
}
