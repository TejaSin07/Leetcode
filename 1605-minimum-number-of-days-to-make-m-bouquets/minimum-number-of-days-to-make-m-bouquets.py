class Solution:
    def minDays(self, bloomDay: List[int], m: int, k: int) -> int:
        def canMakeBouquets(days):
            bouquets = 0
            flowers = 0
            for bloom in bloomDay:
                if bloom <= days:
                    flowers += 1
                    if flowers == k:
                        bouquets += 1
                        flowers = 0
                else:
                    flowers = 0
                if bouquets >= m:
                    return True
            return False
    
        n = len(bloomDay)
        if m * k > n:
            return -1
    
        left, right = min(bloomDay), max(bloomDay)
        
        while left <= right:
            mid = (left + right) // 2
            if canMakeBouquets(mid):
                right = mid - 1
            else:
                left = mid + 1
        
        return left
        # def canMakeBnq(days):
        #     bouquets = 0
        #     flower = 0
        #     for bloom in bloomDay:
        #         if bloom <= days:
        #             flower += 1
        #             if flower == k :
        #                 bouquets +=1
        #                 flower = 0
        #         else:
        #             flower = 0
        #         if bouquets >= m:
        #             return True
        #     return False
        
        # n = len(bloomDay)
        # if m*n > n:
        #     return -1

        # left,right = min(bloomDay),max(bloomDay)
        # while left <= right:
        #     mid = (left + right) //2
        #     if canMakeBnq(mid):
        #         right = mid -1
        #     else:
        #         left = mid + 1
        # return left

