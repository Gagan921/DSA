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
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null &&fast.next!=null){
            fast = fast.next.next;
            slow=slow.next;
        }
        ListNode rev = rever(slow);
        ListNode dumm = head;
        while(rev!=null){
            System.out.println(rev.val);
            if(rev.val!=dumm.val){
                return false;
            }
            rev=rev.next;
            dumm = dumm.next;
        }
        return true;
       
    }
    public static ListNode rever(ListNode slow) {
        ListNode prev = null;
        ListNode curr = slow;
        while(curr!=null){
            ListNode tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        return prev;
    }

}