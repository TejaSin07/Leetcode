class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums)<=1:
            return len(nums)
        index = 0
        i ,k = 0,1
        while k < len(nums):
            if nums[i] != nums[k]:
                nums[index] = nums[k-1]
                index  += 1
                i = k
            k += 1
            if k == len(nums):
                nums[index] = nums[k-1]
                index +=1
        return index