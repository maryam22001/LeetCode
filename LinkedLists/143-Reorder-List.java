/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        /**
         * We are going to split the list from the middle.
         * Input: 1 2 3 4 5 6 7 8 
         * Output: 1 8 2 7 3 6 4 5
         * First half: 1 2 3 4
         * Second half: 5 6 7 8
         * Reverse the second half: 8 7 6 5
         * Then go back and forth to construct a new list.
         */

        if (head == null || head.next == null)
            return;

        ListNode slow = head; // Head of the first half of the list
        ListNode fast = head; // Tail of the second half of the list
        ListNode prev = null; // Tail of the first half of the list

        // Fast node is twice as fast as the slow node
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next; // By the time fast reaches the end, slow is at the middle
        }
        prev.next = null; // Now we have a split list

        ListNode l2 = reverse(slow); // Reverse the second half
        merge(head, l2); // Merge the two halves
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode current_node = head;
        while (current_node != null) {
            ListNode next_node = current_node.next;
            current_node.next = prev;
            prev = current_node;
            current_node = next_node;
        }
        return prev;
    }

    public void merge(ListNode l1, ListNode l2) {
        while (l1 != null) {
            ListNode l1_next = l1.next;
            ListNode l2_next = l2.next;
            l1.next = l2;
            if (l1_next == null) {
                break;
            }
            l2.next = l1_next;
            l1 = l1_next;
            l2 = l2_next;
        }
    }
}
