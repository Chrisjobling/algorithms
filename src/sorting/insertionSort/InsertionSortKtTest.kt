package sorting.insertionSort

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class BubbleSortKtTest {

    @Test
    fun shouldReturnSortedArray() {
        Assertions.assertTrue(arrayOf(1, 2, 3, 6, 8, 9).contentEquals(insertionSort(arrayOf(3, 2, 6, 1, 9, 8))))
    }
}