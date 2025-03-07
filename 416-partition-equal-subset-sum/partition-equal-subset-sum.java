class Solution {
    public boolean canPartition(int[] nums) {
        int len = nums.length;
        int sum = 0;
        for(int i = 0;i< nums.length;i++){
            sum += nums[i]; 
        }

        if(sum%2==1)return false;

        int target = sum/2;

       boolean dp[][] = new boolean[len][target+1];

        for(boolean temp[] : dp){
            Arrays.fill(temp,false);
        }

        for(int i = 0;i< len;i++){
            dp[i][0] = true;
        }

        if(nums[0] <= target){
            dp[0][nums[0]] = true;
        }

        for(int i = 1;i< len;i++){
            for(int t = 1;t<= target;t++){
                //nontaken
                boolean  nontake = dp[i-1][t];
                boolean take = false;
                if(nums[i] <= t){
                    take = dp[i-1][t- nums[i]];
                }
                dp[i][t] = take || nontake; 
            }
        }
        return dp[len-1][target];
    }
}