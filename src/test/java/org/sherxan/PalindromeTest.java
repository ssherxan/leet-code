package org.sherxan;

import org.junit.jupiter.api.Test;
import org.sherxam.Palindrome;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeTest {
    @Test
    void palindrome() {
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.isPalindrome(1221);
        assertTrue(result);
    }

    @Test
    void notPalindrome() {
        Palindrome palindrome = new Palindrome();
        boolean result = palindrome.isPalindrome(1231);
        assertTrue(result);
    }

}
