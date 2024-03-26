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
           dummy= current.next;
           current.next = prev;
           prev = current;
           current = dummy;
        }
       return prev;
    }
}