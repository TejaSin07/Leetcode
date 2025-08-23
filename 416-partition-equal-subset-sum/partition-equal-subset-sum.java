class Solution {
    public boolean canPartition(int[] nums) {
        int len = 0;
        int sum = 0;
        for(int num:nums){
            len++;
            sum += num;
        }
        if(sum%2==1)return false;
        sum = sum/2;
        int [][] dp = new int [len][sum+1];
        for(int ar[] : dp){
            Arrays.fill(ar,-1);
        }
        return helper(0,nums,sum,dp);
    }


    private static boolean helper(int idx,int [] nums,int sum,int [][] dp){
        if(sum == 0)return true;

        if(idx >= nums.length  || sum < 0 )return false;

        if(dp[idx][sum] != -1 )return (dp[idx][sum] == 0)?true:false;

        boolean take = helper(idx+1,nums,sum- nums[idx],dp);
        boolean ntake = helper(idx+1,nums,sum,dp);

        dp[idx][sum] = (take || ntake) ? 0:1;
        return take || ntake;
    }
}