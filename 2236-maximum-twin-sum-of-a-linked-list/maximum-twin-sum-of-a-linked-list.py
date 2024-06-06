# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def pairSum(self, head: Optional[ListNode]) -> int:
        #find middle
        slow,fast = head,head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
        prev = None
        #reverse from middle
        while slow:
            slow_nxt = slow.next
            slow.next = prev
            prev = slow
            slow = slow_nxt
        max_twn_sum=0
        #find sum
        while head and prev:
            max_twn_sum = max(max_twn_sum,head.val+prev.val)
            head = head.next
            prev = prev.next
        return max_twn_sum