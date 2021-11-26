package palindrome

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse

internal class PalindromeKtTest {

    @Test
    fun shouldReturnTrueWhenStringIsPalindrome() {
        assertTrue(isPalindrome("abba"))
        assertTrue(isPalindrome("abcba"))
        assertTrue(isPalindrome("abcdcba"))
        assertTrue(isPalindrome("ab12fgf21ba"))
    }

    @Test
    fun shouldReturnFalseWhenStringInNotPalindrome() {
        assertFalse(isPalindrome("12345"))
        assertFalse(isPalindrome("ab12fagf21ba"))
        assertFalse(isPalindrome("abccbaa"))
        assertFalse(isPalindrome("gghghghghghghghg"))

    }
}