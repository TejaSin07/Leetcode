class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;//by calculation length of each row

        boolean firstRowZero = false;
        boolean firstColZero = false;

        for(int i = 0;i< rows;i++){
            if(matrix[i][0]== 0){
                firstColZero = true;
            }
        }
          for(int j = 0;j< cols;j++){
            if(matrix[0][j]== 0){
                firstRowZero = true;
            }
        }
          for(int i = 1;i< rows;i++){
            for(int j = 1;j<cols;j++){
            if(matrix[i][j]== 0){
                matrix[i][0]=0;
                matrix[0][j]=0;
            }
        }
        }

        for(int i = 1;i<rows;i++){
            if(matrix[i][0]==0){
                for(int j = 1;j<cols;j++){
                    matrix[i][j] = 0;
                }
            }
        }
        for(int j = 1;j<cols;j++){
            if(matrix[0][j]==0){
                for(int i = 1;i<rows;i++){
                    matrix[i][j] = 0;
                }
            }
        }
                if (firstColZero) {
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 0;  // Set the first column to 0
            }
        }
        // Zero out the first row if necessary
        if (firstRowZero) {
            for (int j = 0; j < cols; j++) {
                matrix[0][j] = 0;  // Set the first row to 0
            }
        }

    }
}