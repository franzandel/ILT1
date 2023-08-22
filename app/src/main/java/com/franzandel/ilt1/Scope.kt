package com.franzandel.ilt1

fun main() {
    //without scope function
    val stringBuilder = StringBuilder()
    stringBuilder.append("Hello ")
    stringBuilder.append("Scope ")
    stringBuilder.append("Function")
    stringBuilder.toString()

    val string: StringBuilder? = null

    //Run multiple operations on an object, no null check, not extension function
    val with = with(string) {
        this?.append("Hello ")
        this?.append("Scope ")
        this?.append("Function ")
        this?.append("From With")
        this?.toString()
    }

    //Run multiple operations on an object, with null check
    val let = string?.let {
        it.append("Hello ")
        it.append("Scope ")
        it.append("Function ")
        it.append("From Let")
        it.toString()
    }

    //Initialize and configure an object
    val apply: StringBuilder = StringBuilder().apply {
        this.append("Hello ")
        append("Scope ")
        append("Function ")
        append("From Apply")
        toString() // Returns same object
    }.also { //Additional side-effect
        println("length: ${it.length}")
    }

    // used to create a scope to run an operation over an object, and get a result.
    val run: Int = StringBuilder().run {
        this.append("Hello ")
        append("Scope ")
        append("Function ")
        append("From Run")
        toString()
        length // Returns last statement
    }

    println(run)
}
