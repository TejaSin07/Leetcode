class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        // int [] dp = new int[n];
        int prev =nums[0];
        int sprev = 0;
        for(int i = 1;i< nums.length;i++){
            
        
        int pick = nums[i] + sprev;
        int notpick = prev;
    
        int cur = Math.max(pick,notpick);

        sprev = prev;
        prev = cur;
        }

        return prev;
    }
}