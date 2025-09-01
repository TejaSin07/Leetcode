class Solution {
    public int minCost(int n, int[] cuts) {
        int len = cuts.length;
        Arrays.sort(cuts);
        int arr[] = new int [len+2];
        arr[0] = 0;
        arr[arr.length-1] = n;
        int st = 1;
        for(int k : cuts){
            arr[st++] = k;
        }

        int [][] dp = new int[len+1][len+1];
        for(int [] ar:dp){
            Arrays.fill(ar,-1);
        }

        return helper(1,len,arr,dp);
    }

    private static int helper(int start,int end,int[]arr,int[][]dp){
        if(start > end)return 0;

        if (dp[start][end] != -1) {
            return dp[start][end];
        }
        int mini = Integer.MAX_VALUE;
        for (int ind = start; ind <= end; ind++) {
            int ans = arr[end + 1] - arr[start - 1] +
                      helper(start, ind - 1, arr, dp) +
                      helper(ind + 1, end, arr, dp);

            mini = Math.min(mini, ans);
        }

         return dp[start][end] = mini;
    }
}