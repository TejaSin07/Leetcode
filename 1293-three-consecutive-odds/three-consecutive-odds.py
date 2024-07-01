class Solution:
    def threeConsecutiveOdds(self, arr: List[int]) -> bool:
        k = 0
        for a in arr:
            if a%2 == 1:
                k += 1
                if k > 2:
                    return True
            else:
                k = 0
        return False
        