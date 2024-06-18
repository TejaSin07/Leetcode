class Solution:
    def maxProfitAssignment(self, difficulty: List[int], profit: List[int], worker: List[int]) -> int:
        jobs = sorted(zip(difficulty, profit))
        worker.sort()
        
        max_profit = 0
        total_profit = 0
        j = 0
        
        for ability in worker:
            while j < len(jobs) and jobs[j][0] <= ability:
                max_profit = max(max_profit, jobs[j][1])
                j += 1
            total_profit += max_profit
        
        return total_profit
        # max_profit = 0
        # for a in worker:
        #     i = 0
        #     cur_profit = 0
        #     while i < len(difficulty):
        #         if difficulty[i] <= a:
        #             cur_profit = max(profit[i],cur_profit)
        #         i +=1
        #     max_profit += cur_profit
        # return max_profit
       