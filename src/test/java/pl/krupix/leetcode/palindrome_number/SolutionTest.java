package pl.krupix.leetcode.palindrome_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void case1() {
        // given
        int x = -123;
        // when
        var isPalindrome = new Solution().isPalindrome(x);
        // then
        assertFalse(isPalindrome);
    }

    @Test
    void case2() {
        // given
        int x = 12321;
        // when
        var isPalindrome = new Solution().isPalindrome(x);
        // then
        assertTrue(isPalindrome);
    }

    @Test
    void case3() {
        // given
        int x = 999666;
        // when
        var isPalindrome = new Solution().isPalindrome(x);
        // then
        assertFalse(isPalindrome);
    }

    @Test
    void case4() {
        // given
        int x = 0;
        // when
        var isPalindrome = new Solution().isPalindrome(x);
        // then
        assertTrue(isPalindrome);
    }
}