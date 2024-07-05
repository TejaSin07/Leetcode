# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeNodes(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head.next :
            return None
        new = head.next
        sum = 0

        while new.val != 0:
            sum += new.val
            new = new.next
        head.next.val = sum
        head.next.next = self.mergeNodes(new)
        return head.next


        