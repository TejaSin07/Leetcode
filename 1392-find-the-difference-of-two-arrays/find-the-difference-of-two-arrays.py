class Solution:
    def findDifference(self, nums1: List[int], nums2: List[int]) -> List[List[int]]:
        a = set(nums1)
        b = set(nums2)

        return [list(a-b),list(b-a)]
        
        
        
        
        # k =[]
        # m = []
        # for n in nums1:
        #     if n not in nums2 and n not in k:
        #         k.append(n)
        # for n in nums2:
        #     if n not in nums1 and n not in m:
        #         m.append(n)        
        # return k,m
