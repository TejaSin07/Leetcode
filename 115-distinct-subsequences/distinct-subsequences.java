class Solution {
    public int numDistinct(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();

        int dp[][] = new int[len1][len2];
        for(int ar[] : dp){
            Arrays.fill(ar,-1);
        }

        return helper(0,0,s,t,dp);
    }

    private static int helper(int idx1,int idx2,String s,String t,int [][] dp){
        if(idx2== t.length())return 1;
        if(idx1 == s.length())return 0;

        if(dp[idx1][idx2] != -1)return dp[idx1][idx2];

        int take = 0;
        if(s.charAt(idx1) ==  t.charAt(idx2)){
            take = helper(idx1+1,idx2+1,s,t,dp);
        }
        int nontake = helper(idx1+1,idx2,s,t,dp);
        return dp[idx1][idx2] = take+nontake;
    }
}