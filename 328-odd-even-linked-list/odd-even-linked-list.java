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
    public ListNode oddEvenList(ListNode head) {
        if(head == null )return null;
        ListNode oddHead = head.next;
        ListNode evenHead = head;
        ListNode temp = head.next;

        while(oddHead != null && oddHead.next != null){
            evenHead.next = evenHead.next.next;
            oddHead.next = oddHead.next.next;
            evenHead = evenHead.next;
            oddHead = oddHead.next;
        }
        evenHead.next = temp;
        return head;
    }
    
}