package searching.linearSearch

/*
Linear search finds the element within a list by checking each element. The worst case is 0(n)
if every element must be checked
 */

fun linearSearch(numbers : Array<Int>, targetValue: Int): Int {
    numbers.forEach {
       if(it == targetValue) {
           return targetValue
       }
    }
    return -1
}