class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        merged = []
        a = len(word1)
        b = len(word2)
        i = 0
        
        # Merge characters alternately until the end of one of the strings
        while i < a and i < b:
            merged.append(word1[i])
            merged.append(word2[i])
            i += 1
        
        # Append the remaining characters of the longer string
        if i < a:
            merged.append(word1[i:])
        elif i < b:
            merged.append(word2[i:])
        
        return ''.join(merged)