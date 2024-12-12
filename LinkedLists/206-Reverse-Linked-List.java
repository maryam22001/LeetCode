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
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
  while(head!=null){
    /**we want to have access to a previous node
    so we take the head 's node value and set it to the previous node */
    ListNode next_node =head.next;
    //reverse pointers 
    head.next =prev;
    prev =head;
    head=next_node;

  }
return prev;
        
    }
}