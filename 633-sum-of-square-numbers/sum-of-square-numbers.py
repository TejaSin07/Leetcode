class Solution:
    def judgeSquareSum(self, c: int) -> bool:
        left = 0
        right = int(c**0.5)

        while left <= right:
            cu_sum = left*left + right*right

            if cu_sum < c:
                left +=1
            elif cu_sum == c:
                return True
            else:
                right -= 1
        return False