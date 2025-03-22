class Solution {
    public static int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] result = new int[n]; // Temporary array
        int index = 0;

        // 1st pass: Collect elements less than pivot
        for (int num : nums) {
            if (num < pivot) {
                result[index++] = num;
            }
        }

        // 2nd pass: Collect elements equal to pivot
        for (int num : nums) {
            if (num == pivot) {
                result[index++] = num;
            }
        }

        // 3rd pass: Collect elements greater than pivot
        for (int num : nums) {
            if (num > pivot) {
                result[index++] = num;
            }
        }

        // Copy back to original array to maintain O(1) space
        System.arraycopy(result, 0, nums, 0, n);
        
        return nums;
    }

}