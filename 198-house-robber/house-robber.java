class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int [] dp = new int[n];
        dp[0] =nums[0];
        int pick =0;
        for(int i = 1;i< nums.length;i++){
            
           if(i-2>=0){
                pick = nums[i] + dp[i-2];
           }
           else{
                pick = nums[i];
           }
            int notpick = dp[i-1];
    
            dp[i] = Math.max(pick,notpick);
        }

        return dp[n-1];
    }
}