class Solution {
    public ListNode reverseList(ListNode head) {
        // Base case: if the list is empty, just return null.
        if (head == null) return null;
        // Start the recursion to reverse the list and return the new head.
        return reverse(head);
    }
    // Helper recursive method to reverse the list.
    public static ListNode reverse(ListNode head){
        // Base case: if this is the last node, it becomes the new head of the reversed list.
        if(head.next == null) return head;
        ListNode newHead = reverse(head.next);

        head.next.next = head;

        head.next = null;

        return newHead;
    }
    // https://www.youtube.com/watch?v=G0_I-ZF0S38&t=500s
}
