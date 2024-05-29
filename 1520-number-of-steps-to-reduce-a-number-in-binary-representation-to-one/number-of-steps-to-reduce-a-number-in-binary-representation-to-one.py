class Solution:
    def numSteps(self, s: str) -> int:
        number = int(s, 2)
        res = 0
        while number != 1:
            if number%2==1:
                number +=1
                res +=1
            else:
                number = number//2
                res +=1
        return res