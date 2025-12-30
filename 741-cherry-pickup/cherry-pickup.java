class Solution {
    public int cherryPickup(int[][] grid) {
        Integer dp[][][][] = new Integer [grid.length][grid[0].length][grid.length][grid[0].length];
        return Math.max(0,helper(0,0,0,0,grid,dp));
       
    }

    private int helper(int r1,int c1,int r2,int c2,int [][] grid,Integer[][][][] dp){
        
        int rows = grid.length;
        int cols = grid[0].length;

        if(r1 == rows || r2 == rows || c1 == cols || c2 == cols || grid[r1][c1] == -1 || grid[r2][c2] == -1 )return Integer.MIN_VALUE;

        if( dp[r1][c1][r2][c2] != null)return dp[r1][c1][r2][c2] ;

        if(r1 == r2 && c1== c2 && r1 == rows-1 && c1 == cols-1){
            return  dp[r1][c1][r2][c2]  = grid[r1][c1];
        }

        int one   = helper(r1+1,c1,r2+1,c2,grid,dp);
        int two   = helper(r1+1,c1,r2,c2+1,grid,dp);
        int three = helper(r1,c1+1,r2+1,c2,grid,dp);
        int four  = helper(r1,c1+1,r2,c2+1,grid,dp);

        int max = Math.max(Math.max(one,two),Math.max(three,four));

        if(max == Integer.MIN_VALUE)return dp[r1][c1][r2][c2]  =Integer.MIN_VALUE;

        
        if(c1 == c2 && r1 == r2 ){
            return dp[r1][c1][r2][c2]  = max + grid[r1][c1];
        }
        else{
            return dp[r1][c1][r2][c2]  =  max + grid[r1][c1] + grid[r2][c2];
        }
    }
}