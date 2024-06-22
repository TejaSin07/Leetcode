class Solution:
    def numberOfSubarrays(self, nums: List[int], k: int) -> int:
        left = 0
        ans = 0
        odd_count = 0
        cur_sub_count = 0
        
        for right in range(len(nums)):
            # If the current element is odd, increase the odd_count and reset cur_sub_count
            if nums[right] % 2 == 1:
                odd_count += 1
                cur_sub_count = 0
            
            # When we have exactly k odd numbers in the window
            while odd_count == k:
                # If the left element is odd, decrement odd_count
                if nums[left] % 2 == 1:
                    odd_count -= 1
                # Increase the count of valid subarrays ending at right
                cur_sub_count += 1
                # Move the left pointer to shrink the window
                left += 1
            
            # Add the number of valid subarrays ending at right to the answer
            ans += cur_sub_count
        
        return ans
