class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int dp [] = new int[n];
        dp[0] = grid[0][0];
        for(int i =1;i<n;i++){
            dp[i] = grid[0][i]+dp[i-1];
        }
        for(int row = 1;row< m;row++){
            for(int col = 0;col<n ;col++){
                int down = Integer.MAX_VALUE;
                int right = Integer.MAX_VALUE;
                if(col != 0 ){
                    right = grid[row][col] + dp[col-1];   
                }
                down =  grid[row][col] + dp[col];

                dp[col] = Math.min(right,down) ;
        }
        }
        return dp[n-1];  
    }
}