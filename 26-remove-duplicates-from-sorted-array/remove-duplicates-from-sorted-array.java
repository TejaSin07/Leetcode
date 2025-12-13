class Solution {
    public int removeDuplicates(int[] nums) {
        

        int left = 0;
        for(int right = 0;right<nums.length;right++){

            nums[left++] = nums[right];

            while(right < nums.length-1 && nums[right] == nums[right+1])right++;
        }
        return left;
    }
}