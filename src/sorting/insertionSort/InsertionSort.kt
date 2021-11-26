package sorting.insertionSort

/*
This is an in-place comparison-based sorting algorithm. Here, a sub-list is maintained which is always sorted.
For example, the lower part of an array is maintained to be sorted. An element which is to be 'insert'ed in this sorted sub-list,
has to find its appropriate place and then it has to be inserted there. Hence the name, insertion sort.

The array is searched sequentially and unsorted items are moved and inserted into the sorted sub-list (in the same array).
 This algorithm is not suitable for large data sets as its average and worst case complexity are of Ο(n2),
 where n is the number of items.
 */

fun insertionSort(numbers: Array<Int>): Array<Int> {
    var holePosition = 0
    var valueToInsert = 0


    for (i in numbers.indices) {
        valueToInsert = numbers[i]
        holePosition = i

        while (holePosition > 0 && numbers[holePosition - 1] > valueToInsert) {
            numbers[holePosition] = numbers[holePosition - 1]
            holePosition -= 1

        }

        numbers[holePosition] = valueToInsert
        println(numbers.contentToString())
    }

    return numbers
}