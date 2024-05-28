class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        position = 0
        for i in range(0,len(nums)):
            if nums[i]!=0:
                nums[position] = nums[i]
                position += 1
            
        for i in range(position,len(nums)):
            nums[i] = 0
        """
        Do not return anything, modify nums in-place instead.
        """
        