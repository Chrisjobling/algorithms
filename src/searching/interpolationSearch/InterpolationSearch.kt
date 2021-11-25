package searching.interpolationSearch

/*
Interpolation search is very much like binary search and finds a particular item by computing the probe position.
Initially, the probe position is the position of the middle most item of the collection.
the time complexity is O(log (log n))
 */

fun interpolationSearch(numbers: Array<Int>, targetValue: Int): Int {
    var low = 0
    var high = numbers.size - 1
    var mid: Int
    while (low <= high) {

        if (low == high || numbers[low] == numbers[high]) {
            return -1
        }

        //Probing formula
        mid = low + ((high - low) / (numbers[high] - numbers[low])) * (targetValue - numbers[low])

        //Greater than the middle, ie right side
        if (targetValue > numbers[mid]) {
            low = mid + 1
        }
        //Equal
        if (targetValue == numbers[mid]) {
            return mid
        }
        //Less than the middle, ie left side
        if (targetValue < numbers[mid]) {
            high = mid - 1
        }
    }
    return -1
}