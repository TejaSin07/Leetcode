class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = cols-1;

        int up = 0;
        int down = rows-1;

        int curRow = 0;
        int corCol = 0;

        while(up <= down ){

            int mid = down+(up - down)/2;

            if( matrix[mid][0]<= target &&  matrix[mid][cols-1] >= target){
                curRow = mid;
                break;
            }
            else if(matrix[mid][0] >  target){
                down = mid-1;
            }
            else{
                up = mid+1;
            }
        }
        

        while(left <= right){
            int mid = left + (right-left)/2;

            if(matrix[curRow][mid] == target)return true;
            else if(matrix[curRow][mid] > target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return false;
    }
}