class Solution {
    public int cherryPickup(int[][] grid) {
        int len = grid.length;
        int [][][] dp = new int[len][len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                Arrays.fill(dp[i][j], Integer.MIN_VALUE);
            }
        }
        return Math.max(0,helper(0,0,0,len,grid,dp));
    }



    private static int helper(int r1,int c1,int r2,int len,int[][] grid,int[][][]dp){
        int c2 = r1+c1-r2;
        if(r1 >= len || r2 >= len || c1 >= len || c2 >= len || grid[r1][c1] == -1 || grid[r2][c2] == -1)return Integer.MIN_VALUE;

        if(r1 == len-1 && c1 == len-1)return grid[r1][c1];

        if(dp[r1][c1][r2] != Integer.MIN_VALUE)return dp[r1][c1][r2];

        if(r1 == len-1 && c1 == len-1) {
            return grid[r1][c1];
        }
        int cheri = 0;
        if(r1==r2 && c1 == c2){
            cheri += grid[r1][c1];
        }
        else{
            cheri += grid[r1][c1] + grid[r2][c2];
        }

        //d d
        int downdown = helper(r1+1,c1,r2+1,len,grid,dp);
        //d r
        int downright = helper(r1+1,c1,r2,len,grid,dp);
        //r d
        int rightdown = helper(r1,c1+1,r2+1,len,grid,dp);
        //r r
        int rightright = helper(r1,c1+1,r2,len,grid,dp);

        cheri += Math.max(Math.max(downdown,rightright),Math.max(downright,rightdown));

        return dp[r1][c1][r2] = cheri;

    }
}