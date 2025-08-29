class Solution {
    public int minDistance(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();

        int dp[][] = new int [len1][len2];
        for(int [] ar : dp){
            Arrays.fill(ar,-1);
        }
        return helper(0,0,word1,word2,dp);
    }

    private static int helper(int idx1,int idx2,String str1,String str2,int [][] dp){

        if(idx1 ==str1.length()){
            return str2.length()-idx2;
        }
        if(idx2 ==str2.length()){
            return str1.length()-idx1;
        }

        if(dp[idx1][idx2] != -1)return dp[idx1][idx2];

        if(str1.charAt(idx1) == str2.charAt(idx2)){
            return dp[idx1][idx2] = helper(idx1+1,idx2+1,str1,str2,dp);
        }

        return dp[idx1][idx2] = 1 + Math.min(helper(idx1+1,idx2,str1,str2,dp),Math.min(helper(idx1,idx2+1,str1,str2,dp),helper(idx1+1,idx2+1,str1,str2,dp)));
    }
}