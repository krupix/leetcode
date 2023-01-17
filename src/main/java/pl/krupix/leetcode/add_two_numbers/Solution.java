package pl.krupix.leetcode.add_two_numbers;

/*
 * https://leetcode.com/problems/add-two-numbers/
 * Runtime 2 ms Beats 96.47% Memory 42.1 MB Beats 92.39&
 */
class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        var a = l1;
        var b = l2;

        var result = new ListNode();
        int sum = a.val + b.val;

        int rest = sum > 9 ? sum / 10 : 0;
        sum = sum > 9 ? sum % 10 : sum;

        result.val = sum;

        var current = result;
        while (a.next != null && b.next != null) {
            a = a.next;
            b = b.next;

            sum = a.val + b.val + rest;
            rest = sum > 9 ? sum / 10 : 0;
            sum = sum > 9 ? sum % 10 : sum;

            var next = new ListNode(sum);
            current.next = next;
            current = next;
        }


        ListNode others = null;
        if (a.next != null) {
            others = a.next;
        }
        if (b.next != null) {
            others = b.next;
        }

        if (others != null) {
            do {
                sum = others.val + rest;
                rest = sum > 9 ? sum / 10 : 0;
                sum = sum > 9 ? sum % 10 : sum;
                var next = new ListNode(sum);
                current.next = next;
                current = next;
                others = others.next;
            } while (others != null);
        }
        if (rest > 0) {
            current.next = new ListNode(rest);
        }
        return result;
    }

}