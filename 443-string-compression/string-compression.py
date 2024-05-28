class Solution:
    def compress(self, chars: List[str]) -> int:
        res = []
        r = 0
        counter = 1
        for r in range(1, len(chars)):
            if chars[r] == chars[r - 1]:
                counter += 1
            else:
                res.append(chars[r - 1])
                if counter > 1:
                    for digit in str(counter):  # Convert counter to string and add each digit separately
                        res.append(digit)
                counter = 1
        res.append(chars[-1])
        if counter > 1:
            for digit in str(counter):  # Convert counter to string and add each digit separately
                res.append(digit)
        chars[:len(res)] = res
        return len(res)