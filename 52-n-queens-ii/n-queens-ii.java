class Solution {

    int curCount = 0;
    public int totalNQueens(int n) {
        int queen = n;
        int arr [][] = new int[n][n];

        for(int c = 0;c<n;c++){
            helper(0,c,arr,queen);
        }
        return curCount;
    }


    private  void helper(int row,int col,int [][] arr,int queen ){
        arr[row][col] = 1;
        queen--;
        if(queen == 0){
            curCount++;
            arr[row][col] = 0;
            return;
        }
        for(int c = 0;c<arr.length;c++){
            if(check(row+1,c,arr)){
                helper(row+1,c,arr,queen);
            }
        }
        arr[row][col] = 0;

    }

    private boolean check(int row, int col,int [][]arr){

        int r = row;
        int c = col;

        //vertical
        while(r >= 0){
            if(arr[r][c] == 1)return false;
            r--;
        }

        r = row;
        //leftup 
        while(r >= 0 && c >= 0){
            if(arr[r][c] == 1) return false;
            r--;
            c--;
        }

        r = row;
        c = col;
        //up right

        while(r >=0 && c< arr.length){
            if(arr[r][c] == 1)return false;
            r--;
            c++;
        }
        return true; 
    }
}