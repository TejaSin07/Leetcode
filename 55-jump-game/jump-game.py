class Solution:
    def canJump(self, nums: List[int]) -> bool:
        gas = 0                      #case 1
        for n in nums:              #2          3           1           1           4
            if gas < 0:             #0<0        1<0         2<0         1<0         0<0
                return False                                                        
            elif n > gas:           #2>0        3>1         1>2 false   1>1         4>0
                gas = n             #gas = 2    gas = 3     no change   no change   gas=4 
            gas -= 1                #gas = 1    gas = 2     gas = 1     gas = 0     gas =3
            
        return True



'''Initialize gas to 0. This variable represents the available gas or energy.

Iterate through each element n in the nums list.

Check if gas becomes negative at any point:

If gas becomes negative, it means that we don't have enough gas to proceed further. In this case, we return False, indicating that it's not possible to reach the last index.
Update gas:

If the current element n is greater than the current gas value, it means we found a refill station with more gas. So, update gas to n.
Otherwise, decrement gas by 1, indicating that we consume one unit of gas to move forward.
After iterating through all elements in nums, if we haven't encountered a situation where gas becomes negative, it means it's possible to reach the last index. So, we return True.

Let's illustrate this with an example:
Suppose nums = [2, 5, 1, 0, 4].

Initially, gas = 0.
At index 0, n = 2. Since n > gas, update gas = 2.
At index 1, n = 5. Since n > gas, update gas = 5.
At index 2, n = 1. Since n < gas, decrement gas by 1, so gas = 4.
At index 3, n = 0. Since n < gas, decrement gas by 1, so gas = 3.
At index 4, n = 4. Since n > gas, update gas = 4.
We've reached the end of nums without gas ever becoming negative. So, we return True.'''