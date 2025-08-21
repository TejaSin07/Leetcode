class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int len = matrix.length; //3
        int ans = Integer.MAX_VALUE;
        int [][]  dp = new int[len][len];
        boolean [][] vis = new boolean[len][len];
        int [][] dir = {{1,-1},{1,0},{1,1}};
        for(int i =0;i< len;i++){
            ans = Math.min(helper(0,i,dp,matrix,dir,vis),ans);
        }
        return ans;
    }


    private static int helper(int i,int j,int[][] dp,int [][] matrix,int [][]dir,boolean [][] vis){
        if(i >= dp.length || j < 0 || j >= dp.length )return Integer.MAX_VALUE;
        if(i == dp.length -1){
            dp[i][j] = matrix[i][j];
            vis[i][j] = true;
            return dp[i][j];
        }
        int ans = Integer.MAX_VALUE;
        if(vis[i][j])return dp[i][j];

        for(int temp[] : dir ){
            int r =  i+temp[0];
            int c = j+temp[1];
            
            
            ans = Math.min(helper(r,c,dp,matrix,dir,vis),ans);
            
        }
        dp[i][j] = ans+matrix[i][j];
        vis[i][j] = true;
        
        return dp[i][j];

    }
}