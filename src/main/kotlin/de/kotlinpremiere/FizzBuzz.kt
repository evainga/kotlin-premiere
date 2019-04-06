package de.kotlinpremiere

import org.springframework.stereotype.Service

@Service
class FizzBuzz

fun runFizzBuzz(): MutableList<String> {

    val fizzBuzzItems = mutableListOf<String>()

    for (i in 1..100) {
        if (i % 15 == 0) fizzBuzzItems.add("FizzBuzz")
        else if (i % 3 == 0) fizzBuzzItems.add("Fizz")
        else if (i % 5 == 0) fizzBuzzItems.add("Buzz")
        else fizzBuzzItems.add(i.toString())
    }

    return fizzBuzzItems
}
