class Solution:
    def maxVowels(self, s: str, k: int) -> int:
        vowels = set("aeiou")
        max_len = 0
        curr_len = 0

        for i in range(k):
            if s[i] in vowels:
                curr_len += 1
        max_len = curr_len
        
        for i in range(k,len(s)):
            if s[i-k] in vowels:
                curr_len -= 1
            if s[i] in vowels:
                curr_len +=1

            max_len = max(max_len,curr_len)
        return max_len