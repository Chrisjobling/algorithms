package searching.binarySearch

/*
Binary search finds the position of a target value in a sorted array. The array must be sorted.
Runs in logarithmic time so is O(log n)
 */

fun binarySearch(numbers: Array<Int>, targetValue: Int): Int {
    var low = 0
    var high = numbers.size - 1
    var mid: Int
    while (low <= high) {
        //finding the middle of the array
        mid = ((high - low) / 2) + low
        //Greater than the middle  so change the index to middle + 1, ie right side
        if (targetValue > numbers[mid]) {
            low = mid + 1
        }
        //Equal
        if (targetValue == numbers[mid]) {
            return mid
        }
        //Less than the middle so change the index to middle - 1, ie left side
        if (targetValue < numbers[mid]) {
            high = mid - 1
        }
    }
    return -1

}