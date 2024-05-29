class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        window_sum = 0
        for i in range(k):
            window_sum += nums[i]
        max_avg = window_sum/k

        for i in range(k,len(nums)):
            window_sum += nums[i]-nums[i-k]
            avg = window_sum/k
            max_avg = max(max_avg,avg) 
        return max_avg