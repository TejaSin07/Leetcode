class Solution {
    public int majorityElement(int[] nums) {
         Arrays.sort(nums);
        int k = nums.length/2;
        return nums[k];
    }
}