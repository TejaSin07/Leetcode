class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] output = new int[length];

        // Calculate left products
        int left_prod = 1;
        for (int i = 0; i < length; i++) {
            output[i] = left_prod;
            left_prod *= nums[i];
        }

        // Calculate right products and finalize the result
        int right_prod = 1;
        for (int i = length - 1; i >= 0; i--) {
            output[i] *= right_prod;
            right_prod *= nums[i];
        }

        return output;
    }
}
