class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        # Dictionary to hold the next greater element for each number in nums2
        next_greater = {}
        # Stack to keep track of the numbers for which we haven't found the next greater element yet
        stack = []

        # Traverse nums2 to fill the next_greater dictionary
        for num in nums2:
            # While stack is not empty and the current number is greater than the stack's top element
            while stack and stack[-1] < num:
                # Pop the stack and set the current number as the next greater element for the popped number
                next_greater[stack.pop()] = num
            # Push the current number onto the stack
            stack.append(num)

        # For any remaining numbers in the stack, there is no greater element, so set it to -1
        while stack:
            next_greater[stack.pop()] = -1

        # Construct the result list for nums1 using the next_greater dictionary
        return [next_greater.get(num, -1) for num in nums1]