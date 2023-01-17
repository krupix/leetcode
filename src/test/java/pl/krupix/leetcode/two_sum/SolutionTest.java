package pl.krupix.leetcode.two_sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    @Test
    void testSolutionCase1() {
        // given
        final var nums = new int[]{2, 7, 1, 15};
        final var target = 9;
        // when
        var result = new Solution().twoSum(nums, target);
        // then
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void testSolutionCase2() {
        // given
        final var nums = new int[]{3, 2, 4};
        final var target = 6;
        // when
        var result = new Solution().twoSum(nums, target);
        // then
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    void testSolutionCase3() {
        // given
        final var nums = new int[]{3, 3};
        final var target = 6;
        // when
        var result = new Solution().twoSum(nums, target);
        // then
        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void testSolutionCase6() {
        // given
        final var nums = new int[]{0, 4, 3, 0};
        final var target = 0;
        // when
        var result = new Solution().twoSum(nums, target);
        // then
        assertArrayEquals(new int[]{0, 3}, result);
    }

    @Test
    void testSolutionCase7() {
        // given
        final var nums = new int[]{-1, -2, -3, -4, -5};
        final var target = -8;
        // when
        var result = new Solution().twoSum(nums, target);
        // then
        assertArrayEquals(new int[]{2, 4}, result);
    }

    @Test
    void testSolutioncase11() {
        // given
        final var nums = new int[]{-3, 4, 3, 90};
        final var target = 0;
        // when
        var result = new Solution().twoSum(nums, target);
        // then
        assertArrayEquals(new int[]{0, 2}, result);
    }

    @Test
    void testSolutionCase24() {
        // given
        final var nums = new int[]{3, 2, 3};
        final var target = 6;
        // when
        var result = new Solution().twoSum(nums, target);
        // then
        assertArrayEquals(new int[]{0, 2}, result);
    }

}