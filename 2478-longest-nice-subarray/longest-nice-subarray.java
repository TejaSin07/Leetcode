class Solution {
    public int longestNiceSubarray(int[] nums) {
        int len = nums.length;
        int mlen = 0;
        
        for (int i = 0; i < len; i++) {
            int valid = 0;
            for (int j = i; j < len; j++) {
                if ((valid & nums[j]) != 0) {
                    break; // Stop if AND is nonzero
                }
                valid |= nums[j]; // Add nums[j] to the subarray
                mlen = Math.max(mlen, j - i + 1);
            }
        }
        
        return mlen;
    }
}
