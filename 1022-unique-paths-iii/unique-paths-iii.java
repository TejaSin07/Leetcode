class Solution {
    public int uniquePathsIII(int[][] grid) {
        int rows  = grid.length;
        int cols = grid[0].length;
        int row = 0;
        int col = 0;
        int totalEmp = 0;
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                if(grid[i][j] == 1){
                    row = i;
                    col = j;
                }
                if(grid[i][j] == 0){
                    totalEmp++;
                }
            }
        }

        
        boolean vis[][] = new boolean[rows][cols];
        int [][] dir = {{0,-1},{0,1},{-1,0},{1,0}};
        return helper(row,col,totalEmp+1,grid,vis,dir);
    }


    private static int helper(int row,int col,int totalEmp,int [][] grid,boolean[][] vis,int [][] directions){
        if(row <0 || row >= grid.length || col <0 || col >= grid[0].length || vis[row][col] == true || grid[row][col] == -1 ){
            return 0;
        }
        int ans = 0;

        if(grid[row][col] == 0 || grid[row][col] == 1 )totalEmp--;

        vis[row][col] = true;

        if(totalEmp == 0 && grid[row][col] == 2){
            vis[row][col] = false;
            return 1;
        }
        

        for(int [] dir : directions ){
            int r = row + dir[0];
            int c = col + dir[1];
            ans +=  helper(r,c,totalEmp,grid,vis,directions);
        }

        vis[row][col] = false;
        
        return ans;
    }
}