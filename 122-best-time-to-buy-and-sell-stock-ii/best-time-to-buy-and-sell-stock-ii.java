class Solution {
    public int maxProfit(int[] prices) {
        int dp [][] = new int [prices.length][2];
        for(int ar[] : dp){
            Arrays.fill(ar,-1);
        }

        return helper(0,prices,dp,0);
    }


    private static int helper(int idx,int [] prices,int [][]dp,int buy){

        if(idx == prices.length)return 0;

        if(dp[idx][buy] != -1)return dp[idx][buy];

        if(buy == 0){
            dp[idx][buy] = Math.max(helper(idx+1,prices,dp,1) - prices[idx],helper(idx+1,prices,dp,0));
        }
        else{
             dp[idx][buy] = Math.max(helper(idx+1,prices,dp,0) + prices[idx],helper(idx+1,prices,dp,1));
        }
        return dp[idx][buy];
    }
}