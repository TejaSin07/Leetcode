class Solution:
    def maxVowels(self, s: str, k: int) -> int:
        vowels = set('aeiou')
        max_vowels = 0
        current_vowels = 0

        # Count vowels in the first substring of length k
        for i in range(k):
            if s[i] in vowels:
                current_vowels += 1

        max_vowels = current_vowels

        # Slide the window and update max_vowels
        for i in range(k, len(s)):
            if s[i - k] in vowels:
                current_vowels -= 1
            if s[i] in vowels:
                current_vowels += 1
            max_vowels = max(max_vowels, current_vowels)

        return max_vowels
        