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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;
        dummy.next = head;
        ListNode current = head;
        ListNode start = dummy;
        

        while(current != null){
            int count = 1;
            start = current;
            while(current.next != null && count<k){
                current = current.next;
                count++;
            }
            ListNode nextCurrent = current.next;
            current.next= null;
            if(count == k){       
                ListNode temp = reverse(start);
                start.next = nextCurrent;
                dummy.next = temp;
                dummy = start;
            }
            current = nextCurrent;

        }
        return ans.next;
    }

    private ListNode reverse(ListNode head){

        ListNode prev = null;
        while(head != null){
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
}