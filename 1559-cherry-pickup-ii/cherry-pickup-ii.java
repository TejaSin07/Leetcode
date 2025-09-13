class Solution {
    public int cherryPickup(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int dp[][][] = new int [rows][cols][cols];
        
        for(int outer2[][] : dp){
            for(int outer[] : outer2){
                Arrays.fill(outer,Integer.MIN_VALUE);
            }
        }

        return helper(0,0,cols-1,grid,dp,rows,cols);
    }


    private static int helper(int r1,int c1,int c2,int [][] grid,int [][][] dp,int rows,int cols){

        if(r1 == rows || c1 == cols || c2 == cols || c1 == -1 || c2 == -1)return Integer.MIN_VALUE;

        if(r1 == rows-1){
            if(c1 == c2){
                return grid[r1][c1];
            }
            else{
                return grid[r1][c1] + grid[r1][c2];
            }
        }

        if(dp[r1][c1][c2] != Integer.MIN_VALUE)return dp[r1][c1][c2] ;
        int val = 0;
        if(c1 == c2){
                val +=  grid[r1][c1];
            }
        else{
                val +=  grid[r1][c1] + grid[r1][c2];
        }

        int max = Integer.MIN_VALUE;
        for(int i = -1;i<=1;i++){
            for(int j = -1;j<= 1;j++){
                int temp = helper(r1+1,c1+i,c2+j,grid,dp,rows,cols);
                max = Math.max(temp,max);
            }
        }

        return dp[r1][c1][c2] = max+ val; 
    }
}
















