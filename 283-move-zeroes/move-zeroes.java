class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;

        for(int right = 0;right<nums.length;right++){
            while(right < nums.length && nums[right]==0 ){
                right++;
            }
            if(right < nums.length){
            nums[left++] = nums[right];
            }
        }

        for(int i = left ;i<nums.length;i++){
            nums[i]=0;
        }
    }
}