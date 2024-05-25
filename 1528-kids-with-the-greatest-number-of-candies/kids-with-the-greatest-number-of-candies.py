class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        res = []
        for i in range(0,len(candies)):
            if candies[i]+extraCandies >= max(candies):
                res.append(True) 
            else:
                res.append(False)   
        return res
        