class Solution {

    static int [] dp = new int[31];
    public int fib(int n) {
        if(n == 0)return 0;
        if(n == 1) return 1;
        if(dp[n] != 0)return dp[n];

        int sol = fib(n-1)+ fib(n-2);
        dp[n] = sol;
        return sol;
    }
}