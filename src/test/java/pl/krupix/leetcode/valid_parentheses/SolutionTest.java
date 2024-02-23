package pl.krupix.leetcode.valid_parentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testParentheses() {
        var solution = new Solution();
        assertTrue(solution.isValid("()"));
        assertTrue(solution.isValid("()[]{}"));
        assertFalse(solution.isValid("(]"));
        assertTrue(solution.isValid("{[]}"));
        assertTrue(solution.isValid("{[(){}]{([])}}"));
        assertFalse(solution.isValid("(("));
        assertFalse(solution.isValid("){"));
        assertFalse(solution.isValid("(){}}{"));
    }
}