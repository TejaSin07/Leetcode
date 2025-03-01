class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m =  obstacleGrid.length;
        int n =   obstacleGrid[0].length;
        int dp[][] =new int[m][n];
        
        for(int row = 0;row < m;row++){
            for(int col = 0;col<n;col++){
                if(row == 0 && col ==0) {
                    if(obstacleGrid[0][0] == 1) return 0;
                    dp[row][col] = 1;
                    continue;
                }
                int left = 0;
                int up = 0;
                if(row >0) up = dp[row-1][col];
                if(col>0) left = dp[row][col-1];
                if(obstacleGrid[row][col] != 1){
                    dp[row][col] = left + up;
                }
                else{
                    dp[row][col] = 0;
                }

            }
        }
        return dp[m-1][n-1];
    }
}