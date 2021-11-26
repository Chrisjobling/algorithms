package sorting.bubbleSort

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class BubbleSortKtTest {

    @Test
    fun shouldReturnSortedArray() {
        Assertions.assertTrue(arrayOf(1, 2, 3, 6, 8, 9).contentEquals(bubbleSort(arrayOf(2, 3, 6, 1, 8, 9))))
    }
}