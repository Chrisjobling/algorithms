package searching.interpolationSearch

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class InterpolationSearchKtTest {

    private val UNSUCCESSFUL = -1

    @Test
    fun shouldReturnUnsuccessfulOnEmptyArray() {
        assertEquals(UNSUCCESSFUL, interpolationSearch(arrayOf(),0))
    }

    @Test
    fun shouldReturnUnsuccessfulOnInvalidTarget() {
        assertEquals(UNSUCCESSFUL, interpolationSearch(arrayOf(1,2,4,6,19,20,89,100,199),999))
    }

    @Test
    fun shouldReturnUnsuccessfulOnLessThenLowerBound() {
        assertEquals(UNSUCCESSFUL, interpolationSearch(arrayOf(1,2,4,6,19,20,89,100,199),0))
    }

    @Test
    fun shouldReturnUnsuccessfulOnGreaterThenUpperBound() {
        assertEquals(UNSUCCESSFUL, interpolationSearch(arrayOf(1,2,4,6,19,20,89,100,199),200))
    }

    @Test
    fun shouldReturnSuccessfulWhenInLowerPartOfArray() {
        assertEquals(1, interpolationSearch(arrayOf(1,2,4,6,19,20,89,100,199),2))
    }

    @Test
    fun shouldReturnSuccessfulWhenInMiddleOfArray() {
        assertEquals(4, interpolationSearch(arrayOf(1,2,4,6,19,20,89,100,199),19))
    }

    @Test
    fun shouldReturnSuccessfulWhenInGreaterPartOfArray() {
        assertEquals(6, interpolationSearch(arrayOf(1,2,4,6,19,20,89,100,199),89))
    }

}