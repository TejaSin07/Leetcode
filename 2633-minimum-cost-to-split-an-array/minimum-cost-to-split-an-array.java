class Solution {
    public int minCost(int[] nums, int k) {
        int n = nums.length; // length of nums
        Integer[] memo = new Integer[n]; // memo[i] = min cost from index i
        return dfs(nums, k, 0, memo); // start recursion from index 0
    }

    private int dfs(int[] nums, int k, int start, Integer[] memo) {
        if (start == nums.length) return 0; // base case: no elements left → cost 0
        if (memo[start] != null) return memo[start]; // return cached value

        int n = nums.length; // length of nums
        int[] freq = new int[n + 1]; // frequency array (values are ≤ n per constraints)
        int trimmedLen = 0; // length of trimmed subarray
        int ans = Integer.MAX_VALUE; // store minimum cost

        // try all possible end positions j for subarray starting at 'start'
        for (int j = start; j < n; j++) {
            int val = nums[j]; // current element
            freq[val]++; // increment frequency

            if (freq[val] == 2) {
                // first duplicate → contributes 2 to trimmed length
                trimmedLen += 2;
            } else if (freq[val] > 2) {
                // subsequent duplicates → contribute +1
                trimmedLen += 1;
            }

            // cost of choosing subarray [start..j] + cost of splitting remaining part
            int currentCost = k + trimmedLen + dfs(nums, k, j + 1, memo);
            ans = Math.min(ans, currentCost); // take minimum
        }

        return memo[start] = ans; // store result and return
    }
}
