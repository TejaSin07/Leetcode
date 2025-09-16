class Solution {
    public int minDistance(String text1, String text2) {
 //take best
        Integer[][] dp = new Integer[text1.length()][text2.length()];
        return text1.length() + text2.length() - (2*helper(0,0,text1,text2,dp));
    }

    private static int helper(int idx1,int idx2,String text1,String text2,Integer[][]dp){
        if(idx1 == text1.length() || idx2 == text2.length())return 0;

        if(dp[idx1][idx2] != null)return dp[idx1][idx2];
        if(text1.charAt(idx1) == text2.charAt(idx2)){
            dp[idx1][idx2] =1+helper(idx1+1,idx2+1,text1,text2,dp);
            return dp[idx1][idx2];
        } 

        return dp[idx1][idx2] =Math.max(helper(idx1,idx2+1,text1,text2,dp),helper(idx1+1,idx2,text1,text2,dp));    
    }
}