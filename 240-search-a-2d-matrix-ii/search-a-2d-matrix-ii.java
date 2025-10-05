class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int c = cols-1;
        int r = 0;

        while(r < rows && c >= 0){
            int ele = matrix[r][c];

            if(ele == target )return true;
            if( ele > target){
                c--;
            }
            else{
                r++;
            }
        }
        return false;

    }
}