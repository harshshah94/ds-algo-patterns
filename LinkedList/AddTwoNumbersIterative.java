/**
 * Approach: LinkedList iterative
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
class AddTwoNumbersIterative {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode prevHead = new ListNode();
        ListNode currentNode = prevHead;

        int sum = 0, carry = 0;

        while(l1 != null || l2 != null || carry > 0) {

            sum = carry
                    + (l1 != null ? l1.val : 0)
                    + (l2 != null ? l2.val : 0);

            carry = sum/10;

            currentNode.next = new ListNode(sum % 10);
            currentNode = currentNode.next;

            l1 = l1 == null ? l1 : l1.next;
            l2 = l2 == null ? l2 : l2.next;
        }
        return prevHead.next;
    }
}