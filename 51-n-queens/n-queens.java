class Solution {
    public List<List<String>> solveNQueens(int n) {
        char [][] board = new char[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                board[i][j] = '.';
            }
        }
        List<List<String>> res = new ArrayList<>();
        // List<String> temp = new ArrayList(); ?
        backTrack(0,board,res);
        return res;
    }

    public void backTrack(int col,char[][] board,List<List<String>> res){
        if(col == board.length){
            res.add(construct(board));
            return;
        }

        for(int row = 0;row<board.length;row++){
            if(validate(row,col,board)){
                board[row][col] ='Q';
                backTrack(col+1,board,res);
                board[row][col] = '.';
            }
        }
    }

    public boolean validate(int row,int col,char [][]board){
        int rowt = row;
        int colt = col;
        while(rowt>=0 && colt >= 0){
            if(board[rowt][colt]== 'Q'){
                return false;
            }
            rowt--;
            colt--;
        }

        rowt = row;
        colt = col;
        while(colt>=0){
            if(board[rowt][colt]=='Q'){
                return false;
            }
            colt--;
        }

        rowt = row;
        colt = col;
        while(rowt < board.length && colt >=0){
            if(board[rowt][colt]=='Q'){
                return false;
            }
            rowt++;
            colt--;
        }
        return true;
    }

    public List<String> construct(char[][] board){
        List<String> k = new ArrayList<>();
        for(int col=0;col<board.length;col++){
            StringBuilder temp = new StringBuilder();
            for(int row =0;row<board.length;row++){
                temp.append(board[row][col]);
            }
            k.add(new String(temp));
        }
        return k;
    }
}