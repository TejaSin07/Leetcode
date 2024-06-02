class Solution:
    def findDifference(self, nums1: List[int], nums2: List[int]) -> List[List[int]]:
        k =[]
        m = []
        for n in nums1:
            if n not in nums2 and n not in k:
                k.append(n)
        for n in nums2:
            if n not in nums1 and n not in m:
                m.append(n)
                
        return k,m