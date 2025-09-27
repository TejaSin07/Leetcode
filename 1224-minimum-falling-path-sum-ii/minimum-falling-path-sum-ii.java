class Solution {
    public int minFallingPathSum(int[][] grid) {
        int len = grid.length;
        Integer [][] dp = new Integer[len][len];
        int ans = Integer.MAX_VALUE;
        for(int c = 0;c < len;c++ ){
            ans = Math.min(helper(0,c,grid,len,dp),ans);
        }
        return ans;
    }

    private static int helper(int row,int col,int [][]grid,int len,Integer[][] dp){
        if(row == len)return 0;

        if(dp[row][col] != null)return dp[row][col];

        int min = Integer.MAX_VALUE;

        for(int c = 0;c < len ;c++){
            
            if(c == col )continue;
            min = Math.min(min,helper(row+1,c,grid,len,dp));
        }

        if(min == Integer.MAX_VALUE) return  dp[row][col]=grid[row][col];

        return dp[row][col] =grid[row][col] + min;
    }
}