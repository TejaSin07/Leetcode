class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        
        // Create a new array containing squares of each element
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = nums[i] * nums[i];
        }

        // Sort so we can pick largest for + and smallest for -
        Arrays.sort(arr);

        int start = 0;         // pointer for smallest squared values
        int end = n - 1;       // pointer for largest squared values
        long ans = 0;

        // Alternating addition and subtraction
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                ans += arr[end--];  // even index ⇒ add the largest remaining
            } else {
                ans -= arr[start++]; // odd index ⇒ subtract the smallest remaining
            }
        }

        return ans;
    }
}