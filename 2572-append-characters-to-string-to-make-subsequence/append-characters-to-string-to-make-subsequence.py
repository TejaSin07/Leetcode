class Solution:
    def appendCharacters(self, s: str, t: str) -> int:
        l_s,r_t = 0,0
        while l_s<len(s) and r_t < len(t):
            if s[l_s]== t[r_t]:
                r_t +=1
            l_s +=1
        return len(t)-r_t