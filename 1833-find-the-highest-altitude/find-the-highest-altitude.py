class Solution:
    def largestAltitude(self, gain: List[int]) -> int:
        current_gain = 0
        max_gain = 0
        for i in range(len(gain)) :
            current_gain += gain[i]
            max_gain = max(max_gain,current_gain)

        return max_gain
        