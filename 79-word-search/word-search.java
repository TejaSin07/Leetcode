class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board[0].length;//colmns
        int n = board.length; // rows

        for(int i = 0;i< n;i++){
            for(int j = 0;j< m;j++){
                if(word.charAt(0)==board[i][j]){
                    if(helper(i,j,board,word,0,n,m)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean helper(int row,int col,char[][] board, String word,int ind,int n,int m){

        if(ind == word.length()) return true;

        if(row<0 || col< 0 || row == n || col == m ||  word.charAt(ind) != board[row][col] ||  board[row][col] == '!' ){
            return false;
        }
        char c = board[row][col];
        board[row][col] = '!';
        
        boolean top    = helper(row-1,col,board,word,ind+1,n,m);
        boolean bottom = helper(row+1,col,board,word,ind+1,n,m);
        boolean right  = helper(row,col+1,board,word,ind+1,n,m);
        boolean left  = helper(row,col-1,board,word,ind+1,n,m);

        board[row][col] = c;

    return top || bottom || right || left;

    }

    
}