class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
        int n = triangle.get(m-1).size();
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i],-1);
        }

        return helper(0,0,triangle,dp,m);
    }

    public int helper(int row,int col,List<List<Integer>>tri,int [][]dp,int size){
        if(row == size-1 ){
            return tri.get(row).get(col);
        }

        if(dp[row][col] != -1) return dp[row][col];

        //down

        int down = tri.get(row).get(col) + helper(row+1,col,tri,dp,size);
        int downRight = tri.get(row).get(col) + helper(row+1,col+1,tri,dp,size);

        return dp[row][col] = Math.min(down,downRight);
         
    }

    
}