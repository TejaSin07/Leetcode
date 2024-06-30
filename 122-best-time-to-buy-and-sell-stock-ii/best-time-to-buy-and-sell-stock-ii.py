class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        total_prof = 0 
        for i in range(1,len(prices)):
            if prices[i-1]< prices[i]:
                total_prof += (prices[i]-prices[i-1])

        return total_prof
        