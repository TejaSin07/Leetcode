class Solution {
    public int numberOfPaths(int[][] grid, int k) {
        Integer [][][] dp = new Integer[grid.length][grid[0].length][k];
        return helper(0,0,0,grid,k,dp);
    }

    private int helper(int row,int col,int sum,int[][] grid, int k,Integer [][][] dp){

        int mod = 1000000007;

        if(row >= grid.length || col >= grid[0].length )return 0;

        int newSum = (sum + grid[row][col])%k;

        if(row == grid.length-1 && col == grid[0].length-1){
            if( newSum ==0 )return 1; ///use modulo as we are addding val
            return 0;
        }

        if(dp[row][col][newSum] != null)return dp[row][col][newSum];

        long ans = (long)(helper(row+1,col,newSum,grid,k,dp) + helper(row,col+1,newSum,grid,k,dp));

        return dp[row][col][newSum] = (int)ans%mod;
    } 
}