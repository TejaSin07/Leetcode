class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int result = 0;
        int count = 0;
        for(int right = 0;right < nums.length;right++){

            if(nums[right] == 0){
                count++;
            }

            if(count > k){
                while(nums[left] == 1){
                    left++;
                }
                left++;
                count--;
            }
            result = Math.max(right-left+1,result);
        }
        return result;
    }
}