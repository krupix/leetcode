package pl.krupix.leetcode.add_two_numbers;

/*
 * https://leetcode.com/problems/add-two-numbers/
 */
class SolutionRefactored {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        var a = l1;
        var b = l2;

        var result = new ListNode();
        int sum = a.val + b.val;

        int rest = calculateRest(sum);
        sum = calculateSum(sum);

        result.val = sum;

        var current = result;
        // * sum all numbers when nodes count equals
        while (a.next != null && b.next != null) {
            a = a.next;
            b = b.next;

            sum = a.val + b.val + rest;
            rest = calculateRest(sum);
            sum = calculateSum(sum);

            var next = new ListNode(sum);
            current.next = next;
            current = next;
        }

        // * check and choose node if there left any nodes not calculated
        ListNode others = null;
        if (a.next != null) {
            others = a.next;
        }
        if (b.next != null) {
            others = b.next;
        }

        // * calculate nodes if there are any
        if (others != null) {
            do {
                sum = others.val + rest;
                rest = calculateRest(sum);
                sum = calculateSum(sum);
                var next = new ListNode(sum);
                current.next = next;
                current = next;
                others = others.next;
            } while (others != null);
        }
        // * add last sum if exists
        if (rest > 0) {
            current.next = new ListNode(rest);
        }
        return result;
    }

    private static int calculateSum(int sum) {
        return sum > 9 ? sum % 10 : sum;
    }

    private static int calculateRest(int sum) {
        return sum > 9 ? sum / 10 : 0;
    }

}