class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    int m = obstacleGrid.length;
    int n = obstacleGrid[0].length;
    int dp [][] = new int[m][n];

    // Correct way to fill a 2D array with -1
    for (int i = 0; i < m; i++) {
        Arrays.fill(dp[i], -1);
    }
     return helper(m-1,n-1,dp,obstacleGrid);       
    }

    public int helper(int row,int col,int[][]dp,int[][]arr){
        if(arr[row][col] == 1)return 0;
        if(dp[row][col]  != -1) return dp[row][col];
        if(row == 0 && col == 0){
            dp[row][col] = 1;
            return 1;
        }
        int left = 0;
        int up = 0;
        if(col >0){
            left = helper(row,col-1,dp,arr);
        }
        if(row>0){
            up = helper(row-1,col,dp,arr); 
        }

        dp[row][col] = left + up;

        return dp[row][col];

    }
}