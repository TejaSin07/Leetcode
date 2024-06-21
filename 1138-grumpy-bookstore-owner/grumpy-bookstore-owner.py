class Solution:
    def maxSatisfied(self, customers: List[int], grumpy: List[int], minutes: int) -> int:
        
        # # Part 1: Calculate already satisfied customers
        # already_satisfied = 0
        # for i in range(len(grumpy)):
        #     if grumpy[i] == 0:
        #         already_satisfied += customers[i]
        #         customers[i] = 0  # Mark these customers as 'satisfied' in the customers list
        
        # # Part 2: Find the optimal number of unhappy customers to make happy
        # best_we_can_make_satisfied = 0
        # current_satisfied = 0
        
        # for i in range(len(customers)):
        #     current_satisfied += customers[i]  # Add current to rolling total
            
        #     # If the window exceeds X, slide the window by removing the element that's out of the window
        #     if i >= X:
        #         current_satisfied -= customers[i - X]
                
        #     # Update the maximum number of customers that can be satisfied in any window of size X
        #     best_we_can_make_satisfied = max(best_we_can_make_satisfied, current_satisfied)
        
        # # The answer is the sum of the already satisfied customers and the best window of unsatisfied customers that can be made happy
        # return already_satisfied + best_we_can_make_satisfied
        
        already_satisfied = 0 
        for i in range(len(customers)):
            if grumpy[i] == 0:
                already_satisfied += customers[i]
                customers[i] = 0

        best_we_can_satisfi = 0
        cur_satisfied = 0

        for i in range(len(customers)):
            cur_satisfied += customers[i]

            if i >= minutes:
                cur_satisfied -= customers[i-minutes]
            
            best_we_can_satisfi = max(best_we_can_satisfi,cur_satisfied)

        return best_we_can_satisfi + already_satisfied 