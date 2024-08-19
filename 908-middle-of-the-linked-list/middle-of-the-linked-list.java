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
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null){
            if(fast.next == null){
                return slow;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
        // ListNode tempA = head;
        // int lengthA = 0;
        // int middle = 0;
        // while(tempA != null){
        //     lengthA++;
        //     tempA = tempA.next;
        // }
        
        // middle = (lengthA/2);
        // for(int i =0;i<middle;i++){
        //     head = head.next;
        // }
        // return head;
    }
}