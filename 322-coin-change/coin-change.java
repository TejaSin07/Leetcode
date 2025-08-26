class Solution {
    public int coinChange(int[] arr, int sum) {
        int len = arr.length;
        int [][]dp= new int [len][sum+1];
        if(sum == 0)return 0;
        for(int i=0;i<=sum;i++){
            int val = Integer.MAX_VALUE-1;
            if(i%arr[0]==0){
                val = i/arr[0];
            }
            dp[0][i] = val; 
        }


        for(int i = 1;i<len;i++){
            for(int j = 0;j<=sum;j++){
                int nontake = dp[i-1][j];
                int take = Integer.MAX_VALUE-1;
                if(arr[i] <= j){
                    take =dp[i][j-arr[i]] +1;
                }

                dp[i][j]  = Math.min(nontake,take);
            }
        }
        if(dp[len-1][sum] >= Integer.MAX_VALUE-2)return -1;
        return dp[len-1][sum];
    }
}