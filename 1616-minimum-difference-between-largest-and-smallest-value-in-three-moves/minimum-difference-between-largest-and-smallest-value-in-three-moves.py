class Solution:
    def minDifference(self, nums: List[int]) -> int:
        nums_size = len(nums)

        # If the array has 4 or fewer elements, return 0
        if nums_size <= 4:
            return 0

        nums.sort()

        min_diff = float("inf")

        # Four scenarios to compute the minimum difference
        for left in range(4):
            right = nums_size - 4 + left
            min_diff = min(min_diff, nums[right] - nums[left])

        return min_diff
        # max_dif = 0 
        # if len(nums) <= 4:
        #     return 0
        # else:
        #     nums.sort()
        #     k = len(nums) - 4
        #     first_dif  = nums[k]-nums[0] 
        #     sec_dif = nums[-1]-nums[3]
        #     return min(first_dif,sec_dif)