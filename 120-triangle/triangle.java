class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
        int n = triangle.get(m-1).size();
        int dp[] = new int [n];
        for(int i = 0 ;i< n;i++){
            dp[i] = triangle.get(m-1).get(i);
        }

        for(int row = n-2;row>=0;row--){
            for(int col = 0;col<=row;col++){
                int down = dp[col];
                int diag = dp[col+1];
                dp[col] = Math.min(down,diag) + triangle.get(row).get(col);
            }
        }
        return dp[0];


        // 2
        // 3 4
        // 6 5 7
        // 4 1 8 3
    }
}