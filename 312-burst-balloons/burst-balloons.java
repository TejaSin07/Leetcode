class Solution {
    public int maxCoins(int[] nums) {
        int len = nums.length;
        int arr[] = new int[len+2];
        arr[0] = 1;
        arr[arr.length-1] = 1;
        int pt = 1;
        for(int k: nums){
            arr[pt++] = k;
        }

        int [][] dp = new int [len+1][len+1];

        for(int ar [] : dp){
            Arrays.fill(ar,-1);
        }

        return helper(1,len,arr,dp);
    }


    private static int helper(int start,int end,int [] arr,int [][] dp){

        if(start > end)return 0;

        if(dp[start][end] != -1)return dp[start][end];
        int max = Integer.MIN_VALUE;
        for(int ind = start;ind<= end;ind++){
            int temp = (arr[start-1] * arr[end+1] * arr[ind]) + helper(start,ind-1,arr,dp) + helper(ind+1,end,arr,dp);
            max = Math.max(max,temp);
        }

        return dp[start][end] = max;
    } 
}