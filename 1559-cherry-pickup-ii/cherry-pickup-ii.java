class Solution {
    public int cherryPickup(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int [][][] dp = new int[rows][cols][cols];
        for(int [][] temp1: dp){
            for(int [] temp2 :temp1){
                Arrays.fill(temp2,-1);
            }
        }
        return helper(0,0,cols-1,grid,dp);
    }

    private static int helper(int row,int col1,int col2,int [][] grid,int [][][]dp){

        if(col1 < 0 || col2 < 0 || col1 >= grid[0].length || col2 >= grid[0].length)return 0;

        if(dp[row][col1][col2] != -1) return dp[row][col1][col2];

        if(row == grid.length-1){
            if(col1==col2){
                return grid[row][col1];
            }
            else{
                return grid[row][col1] + grid[row][col2];
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i = -1;i<=1;i++){
            for(int j = -1;j<=1;j++){
                int ans = 0;

                if(col1 == col2){
                    ans = grid[row][col1] + helper(row+1,col1+i,col2+j,grid,dp) ;
                }
                else{
                    ans = grid[row][col1] +grid[row][col2]+ helper(row+1,col1+i,col2+j,grid,dp) ;
                }
                max = Math.max(ans,max);
            }
        }
        dp[row][col1][col2] = max;
        return max;
    }
}