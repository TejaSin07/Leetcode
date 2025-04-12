class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] next = new int[n];
        int[] stack = new int[2 * n];
        int k = -1;
        for (int i = 0; i < 2 * n; i++) {
            int index = i % n;
            while (k != -1 && nums[index] > nums[stack[k]]) {
                next[stack[k--]] = nums[index];
            }
            if (i < n) stack[++k] = index;
        }
        while (k != -1) next[stack[k--]] = -1;
        return next;
    }
}