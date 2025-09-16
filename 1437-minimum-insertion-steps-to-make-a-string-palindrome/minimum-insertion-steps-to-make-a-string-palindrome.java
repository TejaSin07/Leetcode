class Solution {
    public int minInsertions(String s) {
        int len = s.length();
        int idx1 = 0;
        int idx2 = s.length()-1;
        Integer[][] dp = new Integer[len][len];

        return s.length() - helper(idx1,idx2,s,dp);
    }


    private static int helper(int idx1,int idx2,String s,Integer [][]dp){
        if(idx1 >= s.length() ||  idx2 < 0){
            return 0;
        }

        if(dp[idx1][idx2] != null )return dp[idx1][idx2];

        if(s.charAt(idx1) == s.charAt(idx2)){
            return dp[idx1][idx2] = 1+helper(idx1+1,idx2-1,s,dp);
        }

        return dp[idx1][idx2] = Math.max(helper(idx1+1,idx2,s,dp),helper(idx1,idx2-1,s,dp));
    }
}