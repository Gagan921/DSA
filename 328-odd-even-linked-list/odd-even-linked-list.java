class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head; // No need to process if the list has 0 or 1 node
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even; // Save the head of even list

        while (even != null && even.next != null) {
            odd.next = even.next; // Connect odd node with next odd node
            odd = odd.next; // Move odd pointer to the next odd node
            even.next = odd.next; // Connect even node with next even node
            even = even.next; // Move even pointer to the next even node
        }

        odd.next = evenHead; // Connect the last odd node with the head of even list

        return head; // Return the head of the modified list
    }
}
