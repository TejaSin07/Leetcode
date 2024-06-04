class Solution:
    def longestPalindrome(self, s: str) -> int:
        counter1 = Counter(s)
        length = 0
        has_odd = False

        for count in counter1.values():
            if count%2==0:
                length += count
            else:
                length += count -1
                has_odd = True
        if has_odd:
            length += 1
        return length



        