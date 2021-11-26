package sorting.bubbleSort

/* Bubble sort is a simple sorting algorithm. This sorting algorithm is comparison-based algorithm in which each pair of adjacent elements is compared and the elements are swapped if they are not in order.
 This algorithm is not suitable for large data sets as its average and worst case complexity are of Ο(n2) where n is the number of items.*/

fun bubbleSort(numbers: Array<Int>): Array<Int> {
    var swap = true
    while (swap) {
        swap = false
        for (i in 0 until numbers.size - 1) {
            if (numbers[i] > numbers[i + 1]) {
                val temp = numbers[i]
                numbers[i] = numbers[i + 1]
                numbers[i + 1] = temp

                swap = true
            }
        }
    }
    return numbers
}