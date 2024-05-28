class Solution:
    def equalSubstring(self, s: str, t: str, maxCost: int) -> int:
        # Initialize current cost, left pointer, and result
        curCost = 0
        l = 0
        res = 0
        
        # Loop through the string s
        for r in range(len(s)):
            # Calculate the cost of converting character s[r] to t[r] and update current cost
            curCost += abs(ord(s[r]) - ord(t[r]))

            # If the current cost exceeds the maximum allowed cost
            while curCost > maxCost:
                # Update current cost by subtracting the cost of converting character s[l] to t[l]
                curCost -= abs(ord(s[l]) - ord(t[l]))
                # Move left pointer to the right
                l += 1
            
            # Update the result by taking the maximum of the current result and the window size
            res = max(res, r - l + 1)
        
        # Return the final result
        return res
