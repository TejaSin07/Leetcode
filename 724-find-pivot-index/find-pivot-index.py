class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        left_sum = 0
        i = 0
        sum = 0
        left =0 
        while i < len(nums):
            sum += nums[i]
            i +=1
        for k in range(len(nums)):
            while left < k:
                left_sum += nums[left]
                left +=1
            if sum - left_sum - nums[k] == left_sum:
                return k
            left_sum =0
            left = 0
        return -1