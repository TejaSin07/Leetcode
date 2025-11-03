/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        
        while(tempA != null && tempB != null){
            tempA = tempA.next;
            tempB = tempB.next;
        }

        boolean upper = false;
        int count = 0;

        if(tempA != null)upper = true;

        while(tempA != null){
            count++;
            tempA = tempA.next;
        } 

        while(tempB != null){
            count++;
            tempB = tempB.next;
        }
        
        while(count > 0 ){
            if(upper == true){
                headA = headA.next;
            }
            else{
                headB = headB.next;
            }
            count--;
        }

        while(headA != null && headB != null){
            if(headA == headB )return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}





