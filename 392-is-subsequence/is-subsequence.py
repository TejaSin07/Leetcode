class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        left,right =0,0
        s_L= list(s)
        t_L= list(t)
        
        while left<len(t_L):
            if right<len(s_L) and s_L[right] == t_L[left]:
                right +=1
            left +=1
        return right == len(s_L)




        
        