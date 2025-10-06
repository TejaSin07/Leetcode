class Solution {
    public int swimInWater(int[][] grid) {
        int n = grid.length;

        int left = 0;
        int right = n*n;

        while(left <= right){
            int mid = left + (right-left)/2;
            boolean [][] vis = new boolean[n][n];
            if(isPosible(0,0,mid,grid,vis)){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return left;
    }

    private static boolean isPosible(int row,int col,int mid,int [][] grid,boolean[][] vis){
        if(row < 0 || col < 0 || row >= grid.length || col >= grid.length || vis[row][col] || mid < grid[row][col] )return false;

        if(row == grid.length-1 && col == grid.length-1)return true;

        vis[row][col] = true;

        boolean right = isPosible(row,col+1,mid,grid,vis);
        boolean left = isPosible(row,col-1,mid,grid,vis);
        boolean up = isPosible(row+1,col,mid,grid,vis);
        boolean down = isPosible(row-1,col,mid,grid,vis);

        return left || right || up || down;
    }
}