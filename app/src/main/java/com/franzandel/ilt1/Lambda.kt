package com.franzandel.ilt1

//Higher-order Function
fun printMessage(name: String, message: (String) -> String) {
    println(message(name))
}

fun main() {
    //Lambda
    val message: (String) -> String = { name: String ->
        "Hello $name"
    }

    //higher prder function
    printMessage("Dicoding", message)

    //move the variable directly in function
    printMessage("Dicoding", { name: String ->
        "Hello $name"
    })

    //if lambda in the last parameter, we can move to outside parantheses
    printMessage("Dicoding") { name: String ->
        "Hello $name"
    }

    // function reference
    printMessage("Dicoding", ::welcomeMessage)
}

fun welcomeMessage(name: String) = "Hello $name"
