class Solution {
    public void setZeroes(int[][] matrix) {
        boolean firstRow = false;
        boolean firstCol = false;
        int rowlen = matrix.length;
        int collength = matrix[0].length;
        for(int i = 0;i<rowlen;i++){
            if(matrix[i][0]==0){
                firstRow = true;
            }
        }
        for(int i = 0;i<collength;i++){
            if(matrix[0][i]==0){
                firstCol = true;
            }
        }

        for(int i = 1;i<rowlen;i++){
            for(int j = 1;j<collength;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }

        for(int i = 1;i<rowlen;i++){
            if(matrix[i][0]==0){
                for(int j=1;j<collength;j++){
                    matrix[i][j]=0;
                }
            }
        }
        for(int j = 1;j<collength;j++){
            if(matrix[0][j]==0){
                for(int i=1;i<rowlen;i++){
                    matrix[i][j]=0;
                }
            }
        }

        if(firstRow){
            for(int i =0;i<rowlen;i++){
                matrix[i][0]=0;
            }
        }
        if(firstCol){
            for(int i =0;i<collength;i++){
                matrix[0][i]=0;
            }
        }
    }
}