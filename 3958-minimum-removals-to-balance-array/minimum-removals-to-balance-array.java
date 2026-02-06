class Solution {
    public int minRemoval(int[] nums, int k) {
        int len = nums.length;
        Arrays.sort(nums);

        int left = 0;
        int max = 0;

        for(int right = 0;right <len;right++){

            while(nums[right] > (long)k*nums[left])left++;
            max = Math.max(max,right-left+1);
        }

        return len-max;
    }
}