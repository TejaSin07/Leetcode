class Solution:
    def subsetXORSum(self, nums: List[int]) -> int:
        n = len(nums)
        total_sum = 0
        
        # There are 2^n subsets
        for i in range(1 << n):
            xor_sum = 0
            for j in range(n):
                # Check if j-th element is included in the i-th subset
                if i & (1 << j):
                    xor_sum ^= nums[j]
            total_sum += xor_sum
            
        return total_sum
                    