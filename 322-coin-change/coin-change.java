class Solution {
    public int coinChange(int[] coins, int amount) {
        int len = coins.length;
        int [][] dp = new int [len][amount+1];
        for(int i[] : dp){
            Arrays.fill(i,-1);
        }
        int ans = helper(0,coins,amount,dp);
        if(ans > Integer.MAX_VALUE-5)return -1;
        return ans;
    }


    private static int helper(int idx,int [] arr,int target,int [][]dp){
        if(idx == arr.length-1){
            if(target%arr[idx] == 0 ){
                return target/arr[idx];
            }
            else{
                return Integer.MAX_VALUE-1;
            }
        }
        if(dp[idx][target] != -1)return dp[idx][target];
        int nontake = helper(idx+1,arr,target,dp);
        int take = Integer.MAX_VALUE;
        if(arr[idx] <= target){
            take = 1+ helper(idx,arr,target-arr[idx],dp);
        }
        dp[idx][target] = Math.min(take,nontake);
        return dp[idx][target] ;
    }
}