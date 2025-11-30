class Solution {
    public int minSubarray(int[] nums, int p) {
        int n = nums.length;                                   // length of array
        int result = n;                                        // store smallest subarray length
        int totalMod = 0;                                      // total sum modulo p
        // Calculate total sum mod p
        for (int num : nums)
            totalMod = (totalMod + num) % p;                   // compute total sum % p
        // If already divisible, no need to remove anything
        if (totalMod == 0)
            return 0;                                          // already divisible
        // HashMap to store prefixMod → last index where it appeared
        Map<Integer, Integer> prefixIndex = new HashMap<>();
        prefixIndex.put(0, -1);                                // base prefix before start
        int currentMod = 0;                                    // running prefix sum % p
        for (int i = 0; i < n; i++) {
            currentMod = (currentMod + nums[i]) % p;           // update prefix sum % p
            prefixIndex.put(currentMod, i);                    // store the last index for this mod
            int requiredMod = (currentMod - totalMod + p) % p; // we need prefix with this mod
            // If that prefix mod was seen, try to minimize window size
            int prevIndex = prefixIndex.getOrDefault(requiredMod, -n); 
            result = Math.min(result, i - prevIndex);          // update smallest window
        }
        return result == n ? -1 : result;                      // if unchanged, return -1
    }
}
