class Solution {
    public boolean canPartition(int[] nums) {
        int len = 0;
        int sum = 0;
        for(int num:nums){
            len++;
            sum += num;
        }
        if(sum%2==1)return false;
        sum = sum/2;
        boolean [][] dp = new boolean [len][sum+1];
       
        return helper(0,nums,sum,dp);
    }


    private static boolean helper(int idx,int [] arr,int sum,boolean [][] dp){
        
        for(int i = 0;i< dp.length;i++){
            for(int j = 0 ;j< dp[0].length;j++){
                if(j == 0 || j == arr[i]){
                    dp[i][j]  = true;
                    continue;
                }
                if( i > 0 && j - arr[i] >= 0 && dp[i-1][j-arr[i]] == true ){
                    dp[i][j]  = true;
                    continue;
                }
                if(i > 0 && dp[i-1][j] == true){
                    dp[i][j]  = true;
                    continue;
                }
            }
        }
        return dp[ dp.length-1][sum];
    }
}