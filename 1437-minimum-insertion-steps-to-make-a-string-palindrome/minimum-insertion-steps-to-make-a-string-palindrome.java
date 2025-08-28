class Solution {
    public int minInsertions(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return lcs(s, reversed);
    }

    private int lcs(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        int [][] dp = new int [len1+1][len2+1];
        
        for(int i = 1;i <= len1;i++){
            for(int j = 1;j <= len2;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1 +dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return s1.length()-dp[len1][len2];
    }
}