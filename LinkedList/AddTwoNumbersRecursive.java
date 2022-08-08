/**
 *
 * Approach: LinkedList recursive
 *
 * Time Complexity: O(m + n)
 * Space Complexity: O(1)
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class AddTwoNumbersRecursive {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return recursiveAdd(l1, l2, 0);
    }

    public ListNode recursiveAdd(ListNode l1, ListNode l2, int carry) {

        // terminating condition
        if(l1 == null && l2 == null && carry == 0)
            return null;

        int sum = carry
                + (l1 == null ? 0 : l1.val)
                + (l2 == null ? 0 : l2.val);

        ListNode newNode = new ListNode(sum % 10);

        newNode.next = recursiveAdd(
                l1 == null ? l1 : l1.next,
                l2 == null ? l2 : l2.next,
                sum >= 10 ? 1 : 0
        );

        return newNode;
    }
}