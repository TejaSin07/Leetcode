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
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode kaju = null;
        while(slow.next != null){
            ListNode next = slow.next.next;
            slow.next.next = kaju;
            kaju = slow.next;
            slow.next = next;
        }  
        int curSum = 0;
        int maxSum = 0;
        while(kaju != null){
            curSum = kaju.val + head.val;
            if(curSum>maxSum){
                maxSum = curSum;
            }
            kaju = kaju.next;
            head = head.next;
        }
    return maxSum;
    }
}








// By reversing whole linked list

    //   ListNode headTwo = head;
//       ListNode kaju = null;
//       while(headTwo != null){
//         ListNode next = headTwo.next;
//         headTwo.next = kaju;
//         kaju = headTwo;
//         headTwo = next;
//       }  
//       int curSum = 0;
//       int maxSum = 0;
//         while(head != null){
//             curSum = head.val + kaju.val;
//             if(curSum>maxSum){
//                 maxSum = curSum;
//             }
//             head = head.next;
//             kaju = kaju.next;
//         }
//    return maxSum;