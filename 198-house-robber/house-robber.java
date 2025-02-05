class Solution {
    public int rob(int[] nums) {
       int  n = nums.length;
        int[] dp = new int [n];
        for(int i = 0;i<n;i++){
            dp[i] = -1;
        }
        return helper(n-1,nums,dp);
    }

   public int helper(int n,int[] nums,int [] dp){
        int amt = 0;
        if(n < 0) return 0;
        if(n == 0) return nums[0];

        if(dp[n] != -1) return dp[n];
        int pick = nums[n] + helper(n-2,nums,dp);
        int not = helper(n-1,nums,dp); 

        dp[n] = Math.max(pick,not);
        return dp[n];
    }
}