class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int len = matrix.length;
        int [][] mat = new int[len][len];

        for(int i = 0;i< len;i++){
            mat[0][i] = matrix[0][i];
        }
        int [][] dir = {{-1,-1},{-1,0},{-1,1}};

        for(int i = 1;i< len;i++){
            
            for(int j =0;j<len;j++){
                int min = Integer.MAX_VALUE;
                for(int [] temp : dir){
                    int r = temp[0] + i;
                    int c = temp[1] + j;
                    if(c<0 || c>= len)continue;
                    min = Math.min(min,mat[r][c]);
                }
                mat[i][j] =  min + matrix[i][j];
            }
        }
        int ans = Integer.MAX_VALUE;
        for(int k : mat[len-1]){
            ans = Math.min(k,ans);
        }
        return ans;
    }
}