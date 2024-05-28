class Solution:
    def maxArea(self, height: List[int]) -> int:
        left,right = 0,len(height)-1
        max_area = 0
        while left != right:
            curr_area = min(height[right],height[left])*(right-left)

            max_area = max(max_area,curr_area)
            
            if height[left]< height[right]:
                left +=1
            else:
                right -=1



        return max_area
    



















        # left = 0 
        # right = len(height)-1
        # area = 0 
        # while left <right :
        #     currentArea = min(height[left],height[right])*(right-left)
        #     area        = max(currentArea,area)

        #     if height[left] < height[right] :
        #         left += 1
        #     else: 
        #         right -= 1

        # return area

