class Solution {
    
    public int uniquePaths(int m, int n) {
    int dp [][] = new int[m][n];

    // Correct way to fill a 2D array with -1
    for (int i = 0; i < m; i++) {
        Arrays.fill(dp[i], -1);
    }
     return helper(m-1,n-1,dp);       
    }

    public int helper(int row,int col,int[][]dp){

        if(dp[row][col]  != -1) return dp[row][col];
        if(row == 0 && col == 0){
            dp[row][col] = 1;
            return 1;
        }
        int left = 0;
        int up = 0;
        if(col >0){
            left = helper(row,col-1,dp);
        }
        if(row>0){
            up = helper(row-1,col,dp); 
        }

        dp[row][col] = left + up;

        return dp[row][col];

    }
}