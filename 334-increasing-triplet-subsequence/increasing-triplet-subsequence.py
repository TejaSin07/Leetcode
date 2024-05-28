class Solution:
    def increasingTriplet(self, nums: List[int]) -> bool:
            
        # Initialize two variables to positive infinity.
        # `first` will store the smallest number encountered so far.
        # `second` will store the second smallest number greater than `first`.
        first = second = float('inf')
        
        # Loop through each number in the list.
        for n in nums:
            # If the current number is less than or equal to `first`,
            # update `first` to be the current number.
            if n <= first:
                first = n
            # Otherwise, if the current number is greater than `first` but less than or equal to `second`,
            # update `second` to be the current number.
            elif n <= second:
                second = n
            # If the current number is greater than both `first` and `second`,
            # it means we have found an increasing triplet.
            else:
                return True
        
        # If the loop completes without finding an increasing triplet,
        # return False.
        return False
