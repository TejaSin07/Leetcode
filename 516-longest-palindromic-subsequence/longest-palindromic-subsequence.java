class Solution {
    public int longestPalindromeSubseq(String s) {
        int len = s.length();
        int dp [][] = new int[len][len];

        for(int arr[] : dp){
            Arrays.fill(arr,-1);
        }

        return helper(0,len-1,s,dp);
    }

    private static int helper(int front,int back,String str,int[][]dp){
        if(front >= str.length() || back < 0)return 0;

        if(dp[front][back] != -1)return dp[front][back];

        if(str.charAt(front) == str.charAt(back)){
            dp[front][back] = 1 + helper(front+1,back-1,str,dp);
            return dp[front][back];
        }

        dp[front][back] = Math.max(helper(front+1,back,str,dp),helper(front,back-1,str,dp));
        return dp[front][back];
    }
}