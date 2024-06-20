# The isBadVersion API is already defined for you.
# def isBadVersion(version: int) -> bool:

class Solution:
    def firstBadVersion(self, n: int) -> int:
        i = 0
        j  = n

        while i < j:
            pivot = (i+j)//2
            if isBadVersion(pivot):
                j = pivot
            else:
                i = pivot + 1
        return i
        