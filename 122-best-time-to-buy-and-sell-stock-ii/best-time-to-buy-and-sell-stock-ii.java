class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        // next[0] → profit if we can buy
        // next[1] → profit if we have stock and can sell
        int[] next = new int[2];
        int[] curr = new int[2];

        // Base case: when index == n, profit = 0
        next[0] = next[1] = 0;

        for (int index = n - 1; index >= 0; index--) {
            // Case when we can buy
            curr[0] = Math.max(next[0], -prices[index] + next[1]);

            // Case when we can sell
            curr[1] = Math.max(next[1], prices[index] + next[0]);

            // Move curr → next for next iteration
            next[0] = curr[0];
            next[1] = curr[1];
        }

        // Start at day 0 with the option to buy
        return next[0];
    }
}
