class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        # Initialize pointers for both strings
        left, right = 0, 0
        # Convert the strings to lists for easier element access
        s_L = list(s)
        t_L = list(t)

        # Iterate through the characters in t_L using the left pointer
        while left < len(t_L):
            # Ensure right is within bounds of s_L before comparing characters
            if right < len(s_L) and s_L[right] == t_L[left]:
                # Move to the next character in s_L if there's a match
                right += 1
            # Always move to the next character in t_L
            left += 1

        # If right pointer has reached the end of s_L, all characters were matched in sequence
        return right == len(s_L)




        
        