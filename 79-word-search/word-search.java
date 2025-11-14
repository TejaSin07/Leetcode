class Solution {
    public boolean exist(char[][] board, String word) {
    
        boolean [][] vis = new boolean[board.length][board[0].length];

        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                if(board[i][j] == word.charAt(0)){
                    if(helper(1,i,j,vis,board,word))return true;
                }
            }
        }
        return false;
    }


    private boolean helper(int ind,int row,int col,boolean [][] vis,char[][] board,String word){
        
        if(ind == word.length())return true;
        
        vis[row][col] = true;

        boolean right = false;
        boolean left = false;
        boolean up = false;
        boolean down = false;

        if( row+1 < board.length && word.charAt(ind) == board[row+1][col] && vis[row+1][col] == false )  down = helper(ind+1,row+1,col,vis,board,word);
        if( row-1 >= 0  && word.charAt(ind) == board[row-1][col]          && vis[row-1][col] == false )    up = helper(ind+1,row-1,col,vis,board,word);
        if( col+1 < board[0].length && word.charAt(ind) == board[row][col+1] && vis[row][col+1] == false)right = helper(ind+1,row,col+1,vis,board,word);
        if( col-1 >= 0 && word.charAt(ind) == board[row][col-1]   && vis[row][col-1] == false )left= helper(ind+1,row,col-1,vis,board,word);

        vis[row][col] = false;

        return right || left || up || down;
 
    }
}