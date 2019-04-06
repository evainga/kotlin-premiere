package de.kotlinpremiere

import org.assertj.core.api.KotlinAssertions
import org.junit.Test

class FizzBuzzTest {

    private val fizzBuzz = FizzBuzz()

    @Test
    fun test() {
        val result = runFizzBuzz()
        KotlinAssertions.assertThat(result).hasSize(100)
        KotlinAssertions.assertThat(result[0]).isEqualTo("1")
        KotlinAssertions.assertThat(result[1]).isEqualTo("2")
        KotlinAssertions.assertThat(result[2]).isEqualTo("Fizz")
        KotlinAssertions.assertThat(result[3]).isEqualTo("4")
        KotlinAssertions.assertThat(result[4]).isEqualTo("Buzz")
        KotlinAssertions.assertThat(result[5]).isEqualTo("Fizz")
        KotlinAssertions.assertThat(result[14]).isEqualTo("FizzBuzz")
        KotlinAssertions.assertThat(result[29]).isEqualTo("FizzBuzz")
        KotlinAssertions.assertThat(result[97]).isEqualTo("98")
        KotlinAssertions.assertThat(result[98]).isEqualTo("Fizz")
        KotlinAssertions.assertThat(result[99]).isEqualTo("Buzz")
    }
}
