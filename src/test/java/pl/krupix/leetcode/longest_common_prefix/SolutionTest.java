package pl.krupix.leetcode.longest_common_prefix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void longestCommonPrefix() {
        var solution = new Solution();
        assertEquals("fl", solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        assertEquals("", solution.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        assertEquals("a", solution.longestCommonPrefix(new String[]{"ab", "a"}));
    }

    @Test
    void longestCommonPrefix_GPTVersion() {
        var solution = new Solution();
        assertEquals("fl", solution.longestCommonPrefix_GPTVersion(new String[]{"flower", "flow", "flight"}));
        assertEquals("", solution.longestCommonPrefix_GPTVersion(new String[]{"dog", "racecar", "car"}));
        assertEquals("a", solution.longestCommonPrefix_GPTVersion(new String[]{"ab", "a"}));
    }
}