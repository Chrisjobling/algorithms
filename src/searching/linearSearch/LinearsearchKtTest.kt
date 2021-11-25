package searching.linearSearch

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class LinearSearchKtTest {

    private val UNSUCCESSFUL = -1

    @Test
    fun shouldReturnUnsuccessfulOnEmptyArray() {
        assertEquals(UNSUCCESSFUL, linearSearch(arrayOf(),0))
    }

    @Test
    fun shouldReturnUnsuccessfulOnInvalidTarget() {
        assertEquals(UNSUCCESSFUL, linearSearch(arrayOf(1,2,4,6,19,20,89,100,199),999))
    }

    @Test
    fun shouldReturnUnsuccessfulOnLessThenLowerBound() {
        assertEquals(UNSUCCESSFUL, linearSearch(arrayOf(1,2,4,6,19,20,89,100,199),0))
    }

    @Test
    fun shouldReturnUnsuccessfulOnGreaterThenUpperBound() {
        assertEquals(UNSUCCESSFUL, linearSearch(arrayOf(1,2,4,6,19,20,89,100,199),200))
    }

    @Test
    fun shouldReturnSuccessfulWhenInTheList() {
        assertEquals(100, linearSearch(arrayOf(1,2,4,6,19,20,89,100,199),100))
    }

}