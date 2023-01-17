package pl.krupix.leetcode.add_two_numbers;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        var result = new StringBuilder("[");
        var node = this;
        do {
            result.append(node.val).append(", ");
            node = node.next;
        } while (node != null);
        return (result.substring(0, result.length() - 2)) + "]";
    }

    int countNodes() {
        var nodeCount = this;
        int count = 1;
        while (nodeCount.next != null) {
            count++;
            nodeCount = nodeCount.next;
        }
        return count;
    }
}
