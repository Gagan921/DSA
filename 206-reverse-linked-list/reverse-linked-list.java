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
        ListNode dummy= new ListNode(-1);
        ListNode current = head;
        ListNode prev = null;
        while(current!=null){
           dummy= current.next; // Store the next node temporarily
           current.next = prev; //Reverse the link to point to the previous node
           prev = current; // Move prev and current one step forward
           current = dummy; // Move current one step forward using the temporary variable
        }
       return prev; // Return the new head of the reversed list
    }
}