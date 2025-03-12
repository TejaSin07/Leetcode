class Solution {
    public int coinChange(int[] coins, int amount) {
        int len = coins.length;
        int dp [][] = new int[len][amount+1];

        for(int temp[] : dp){
            Arrays.fill(temp,-1);
        }

        int result = helper(len-1,amount,coins,dp);
        if(result == Integer.MAX_VALUE -1){
            return -1;
        }
        return result;
    }

    int helper(int row ,int target,int[] arr,int [][]dp){
        if(target == 0) return 0;
        if(row == 0){
            if(target%arr[0]== 0){
                return target/arr[0];
            }
            return Integer.MAX_VALUE -1;
        }

        if(dp[row][target]  != -1) return dp[row][target];

        int nt = helper(row-1,target,arr,dp);
        int t = Integer.MAX_VALUE-1;
        if(arr[row] <= target){
            t= 1+ helper(row,target - arr[row],arr,dp);
        }
        return dp[row][target] =Math.min( t,nt) ;
    }
}