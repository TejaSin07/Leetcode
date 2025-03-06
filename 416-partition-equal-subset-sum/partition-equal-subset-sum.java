class Solution {
    public boolean canPartition(int[] nums) {
        int  n = nums.length;
        int sum = 0;
        for(int a : nums){
            sum += a;
        }
        if(sum%2 == 1){
            return false;
        }
        int target = sum/2;
        int [][] dp = new int[n][target+1];
        for(int [] a:dp){
            Arrays.fill(a,-1);
        }
        return helper(n-1,target,nums,dp); 
    }

        public   boolean helper(int i,int target,int [] nums,int[][]dp){
            if(target==0){
                return true;
            }
            if(i == 0){
                return target == nums[0];
            }

            if(dp[i][target] != -1){
                return dp[i][target] == 1;
            }

            //not taken
            boolean notTaken = helper(i-1,target,nums,dp);
            boolean taken = false;
            
            //taken
            if(nums[i] <= target){
                taken = helper(i-1,target- nums[i],nums,dp);
            }

            dp[i][target] = (taken || notTaken) ? 1:0;

            return dp[i][target]==1;
        }
}