package palindrome

/*
Palindrome is a sequence of characters that reads the same forwards and backwards
 */

//fun isPalindrome(word: String): Boolean {
//    return word == word.reversed()
//}

fun isPalindrome(word: String): Boolean {
    var endIndex = word.length - 1
    for (letter in word) {
        if (letter == word[endIndex]) {
            endIndex--
        } else return false
    }
    return true
}