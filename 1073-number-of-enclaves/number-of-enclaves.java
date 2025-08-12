class Solution {
    public int numEnclaves(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        boolean vis [][] = new boolean[row][col];

        for(int i = 0; i < row; i++) {
            if(grid[i][0] == 1) dfs(i, 0,grid,vis,row,col);
            if(grid[i][col -1] == 1) dfs(i, col - 1,grid,vis,row,col);
        }

        for(int j = 0; j < col; j++) {
            if(grid[0][j] == 1) dfs(0, j,grid,vis,row,col);
            if(grid[row - 1][j] == 1) dfs(row - 1, j,grid,vis,row,col);
        }

        int count = 0;
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                if(vis[i][j] == false && grid[i][j]==1){
                    count++;
                }
            }
        }
        return count;

        
    }
    public void dfs(int i ,int j,int[][] grid,boolean[][] vis,int row,int col){
            vis[i][j] = true;
            int [][] adj = {{1,0},{-1,0},{0,1},{0,-1}};
            for(int [] a:adj){
                int r= a[0] + i;
                int c = a[1] + j;
                if(r >= 0 && r < row && c >= 0 && c < col && vis[r][c] == false&& grid[r][c] == 1){
                    dfs(r,c,grid,vis,row,col);
                }
            }
        }
}