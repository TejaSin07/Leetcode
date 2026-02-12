class Solution {

    public boolean isInterleave(String s1, String s2, String s3) {

        if (s1.length() + s2.length() != s3.length())
            return false;

        Boolean[][] dp = new Boolean[s1.length() + 1][s2.length() + 1];

        return helper(s1, s2, s3, 0, 0, dp);
    }

    boolean helper(String s1, String s2, String s3, int p1, int p2, Boolean[][] dp) {

        if (dp[p1][p2] != null)
            return dp[p1][p2];

        int p3 = p1 + p2;

        if (p3 == s3.length())
            return dp[p1][p2] = (p1 == s1.length() && p2 == s2.length());

        boolean ans = false;

        if (p1 < s1.length() && s3.charAt(p3) == s1.charAt(p1)) {
            ans = helper(s1, s2, s3, p1 + 1, p2, dp);
        }

        if (!ans && p2 < s2.length() && s3.charAt(p3) == s2.charAt(p2)) {
            ans = helper(s1, s2, s3, p1, p2 + 1, dp);
        }

        return dp[p1][p2] = ans;
    }
}

