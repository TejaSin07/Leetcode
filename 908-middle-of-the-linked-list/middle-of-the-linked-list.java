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
        ListNode tempA = head;
        int lengthA = 0;
        int middle = 0;
        while(tempA != null){
            lengthA++;
            tempA = tempA.next;
        }
        
        middle = (lengthA/2);
        for(int i =0;i<middle;i++){
            head = head.next;
        }
        return head;
    }
}