class Solution {
    public int change(int amount, int[] coins) {
        int len = coins.length;
        int dp[][] = new int[len][amount+1];

        for(int i = 0;i<= amount;i++){
            if(i%coins[0]==0){
                dp[0][i] =1;
            }
        }

        for(int i = 1;i<len;i++){
            for(int j = 0;j<=amount;j++){
                int nontake = dp[i-1][j];
                int take =0;
                if(j-coins[i] >=0){
                    take = dp[i][j-coins[i]];
                }

                dp[i][j] = take+nontake;
            }
        }

        return dp[len-1][amount];
    }
}