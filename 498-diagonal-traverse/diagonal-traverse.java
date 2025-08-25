class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int size = rows*cols;
        ArrayList<Integer> ans = new ArrayList<>();
        int [] sol = new int [size];
        helper(0,0,mat,ans,rows,cols);
        for(int i = 0;i<size;i++){
            sol[i] = ans.get(i);
        }
        return sol;


    }

    private static void helper(int row,int col,int [][] mat,ArrayList<Integer> ans,int rows,int cols){
        int tempR = row;
        int tempC = col;
        if(row == rows-1 && col == cols-1){
            ans.add(mat[tempR][tempC]);
            return;
        }

        //up
        while(tempR >= 0 && tempC < cols ){
            
            ans.add(mat[tempR][tempC]);
            tempR = tempR-1;
            tempC = tempC+1;            
        }

        if(tempR< 0 && tempC < cols){
            tempR = tempR+1; 
        }
        else{
            tempR = tempR+2; 
            tempC--;
        }

        if(tempR == rows)return;

        while(tempR < rows && tempC >=0){
            ans.add(mat[tempR][tempC]);
            tempR = tempR +1;
            tempC = tempC-1;
        }

        if(tempC < 0 && tempR < rows){
            tempC = tempC +1;
        }
        else{
            tempR = tempR-1;
            tempC = tempC+2;
        }
        
        if(tempC == cols)return;

        helper(tempR,tempC,mat,ans,rows,cols);
    }
}












