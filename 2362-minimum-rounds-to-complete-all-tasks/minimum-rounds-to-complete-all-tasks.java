class Solution {

    public int minimumRounds(int[] tasks) {
        Arrays.sort(tasks);

        int[] dp = new int[tasks.length + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[tasks.length] = 0;

        for (int i = tasks.length - 2; i >= 0; i--) {
            if (tasks[i] != tasks[i + 1] ) continue;

            if (tasks[i + 1] == tasks[i])
                dp[i] = Math.min(dp[i], dp[i + 2]);
                
            if (i + 2 < tasks.length && tasks[i + 2] == tasks[i])
                dp[i] = Math.min(dp[i], dp[i + 3]);

            if (dp[i] != Integer.MAX_VALUE)
                dp[i] = dp[i] + 1;
        }
        return dp[0] == Integer.MAX_VALUE ? -1 : dp[0] ;
    }
}
