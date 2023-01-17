package pl.krupix.leetcode.add_two_numbers;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void case1() {
        // given
        var l1 = createNode(2, 4, 3);
        var l2 = createNode(5, 6, 4);
        // when
        var result = new Solution().addTwoNumbers(l1, l2);
        // then
        assertTrue(validateResult(result, 7, 0, 8));
    }

    @Test
    void case2() {
        // given
        var l1 = createNode(0);
        var l2 = createNode(0);
        // when
        var result = new Solution().addTwoNumbers(l1, l2);
        // then
        assertTrue(validateResult(result, 0));
    }

    @Test
    void case3() {
        // given
        var l1 = createNode(9, 9, 9, 9, 9, 9, 9);
        var l2 = createNode(9, 9, 9, 9);
        // when
        var result = new Solution().addTwoNumbers(l1, l2);
        // then
        assertTrue(validateResult(result, 8, 9, 9, 9, 0, 0, 0, 1));
    }

    @Test
    void case3_incorrectResult() {
        // given
        var l1 = createNode(9, 9, 9, 9, 9, 9, 9);
        var l2 = createNode(9, 9, 9, 9);
        // when
        var result = new Solution().addTwoNumbers(l1, l2);
        // then
        assertFalse(validateResult(result, 0));
    }

    @Test
    void case818() {
        // given
        var l1 = createNode(2, 4, 9);
        var l2 = createNode(5, 6, 4, 9);
        // when
        var result = new Solution().addTwoNumbers(l1, l2);
        // then
        assertTrue(validateResult(result, 7, 0, 4, 0, 1));
    }

    private ListNode createNode(int... numbers) {
        ListNode result = null;
        ListNode previous = null;
        for (var nr : numbers) {
            if (result == null) {
                result = new ListNode(nr);
                previous = result;
            } else {
                previous.next = new ListNode(nr);
                previous = previous.next;
            }
        }
        System.out.println("node created=" + result);
        return result;
    }

    private boolean validateResult(ListNode listNode, int... numbers) {
        System.out.println("result=" + listNode + "\nexpect=" + Arrays.toString(numbers));
        var current = listNode;
        for (var nr : numbers) {
            if (current == null) {
                System.out.println("Current is null");
                return false;
            }
            if (current.val != nr) {
                System.out.println("Values not equals: " + current.val + " vs " + nr);
                return false;
            }
            current = current.next;
        }
        if (listNode.countNodes() != numbers.length) {
            System.out.println("Count not equals");
            return false;
        }
        return true;
    }
}