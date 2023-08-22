package com.franzandel.ilt1

enum class Status {
    SUCCESS,
    ERROR,
    LOADING
}

sealed class Result<out T> {
    data class Success<T>(val data: T) : Result<T>()
    data class Error(val error: String) : Result<Nothing>()
    object Loading : Result<Nothing>()
}

class Data(val name: String)

fun main(){
    val data = Data("Dicoding")

    val status: Status = Status.SUCCESS
    val statusMessage = when(status){
        Status.SUCCESS -> println("Success")
        Status.ERROR -> println("Error")
        Status.LOADING -> println("Loading")
    }

    val result: Result<Data> = Result.Success(data)
    val resultMessage = when(result){
        is Result.Success -> println("Success : ${data.name}")
        is Result.Error -> println("Error")
        is Result.Loading -> println("Loading")
        else -> println("undefined")
    }
}
