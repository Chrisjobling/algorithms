package searching.binarySearch

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class BinarySearchKtTest {

    private val UNSUCCESSFUL = -1

    @Test
    fun shouldReturnUnsuccessfulOnEmptyArray() {
        assertEquals(UNSUCCESSFUL, binarySearch(arrayOf(), 0))
    }

    @Test
    fun shouldReturnUnsuccessfulOnInvalidTarget() {
        assertEquals(UNSUCCESSFUL, binarySearch(arrayOf(1, 2, 4, 6, 19, 20, 89, 100, 199), 999))
    }

    @Test
    fun shouldReturnUnsuccessfulOnLessThenLowerBound() {
        assertEquals(UNSUCCESSFUL, binarySearch(arrayOf(1, 2, 4, 6, 19, 20, 89, 100, 199), 0))
    }

    @Test
    fun shouldReturnUnsuccessfulOnGreaterThenUpperBound() {
        assertEquals(UNSUCCESSFUL, binarySearch(arrayOf(1, 2, 4, 6, 19, 20, 89, 100, 199), 200))
    }

    @Test
    fun shouldReturnSuccessfulWhenInLowerPartOfArray() {
        assertEquals(1, binarySearch(arrayOf(1, 2, 4, 6, 19, 20, 89, 100, 199), 2))
    }

    @Test
    fun shouldReturnSuccessfulWhenInMiddleOfArray() {
        assertEquals(4, binarySearch(arrayOf(1, 2, 4, 6, 19, 20, 89, 100, 199), 19))
    }

    @Test
    fun shouldReturnSuccessfulWhenInGreaterPartOfArray() {
        assertEquals(6, binarySearch(arrayOf(1, 2, 4, 6, 19, 20, 89, 100, 199), 89))
    }
}