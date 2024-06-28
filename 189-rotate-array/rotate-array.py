class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        k = k%n
        def reverseArr(start,end):
            while start < end:
                nums[start],nums[end] = nums[end],nums[start]
                start += 1
                end-=1
        #reverse array
     
        reverseArr(0,n-1)

        #reverse  first k element
        reverseArr(0,k-1)

        #reverse remaining element
        reverseArr(k,n-1)        