class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        int dp [] = new int[len];{
            Arrays.fill(dp,Integer.MAX_VALUE);
        }

        return Math.min(helper(0,cost,dp), helper(1,cost,dp));
        
    }

    private static int helper(int idx,int[] cost,int [] dp){
        if(idx == cost.length-1)return cost[cost.length-1];
        if(idx == cost.length-2)return cost[cost.length-2];
        if(dp[idx] != Integer.MAX_VALUE)return dp[idx];
        dp[idx] = cost[idx] + Math.min(helper(idx+1,cost,dp),helper(idx+2,cost,dp));
       
        return dp[idx];
    }
}