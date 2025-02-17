class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for(int i = 0;i< m;i++){
            Arrays.fill(dp[i],-1);
        }
        
        int sol[] =  new int[2];
        return helper(m-1,n-1,dp,grid);
    }
    public int helper(int row,int col,int[][] dp,int[][] arr){
        if(dp[row][col] != -1) return dp[row][col];
    int left =  Integer.MAX_VALUE;
    int up = Integer.MAX_VALUE;
        if(row == 0 && col == 0){
            dp[row][col] = arr[row][col];
            return dp[row][col];
        }

        if(row>0){
            //up
            up = helper(row-1,col,dp,arr) + arr[row][col]; 
        }
        if(col>0){
            //left 
            left = helper(row,col-1,dp,arr) + arr[row][col];
        }


        dp[row][col] = Math.min(left,up);

        return dp[row][col];

     }
}