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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1); 
        ListNode current = dummy; 

        ListNode a1 = list1;
        ListNode a2 = list2;

        while (a1 != null && a2 != null) {
            if (a1.val <= a2.val) {
                current.next = a1;
                a1 = a1.next;
            } else {
                current.next = a2;
                a2 = a2.next;
            }
            current = current.next;
        }

        if (a1 != null) {
            current.next = a1;
        } else {
            current.next = a2;
        }

        return dummy.next; 
    }
}