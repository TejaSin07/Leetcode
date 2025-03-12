class Solution {
    public int maximumCount(int[] nums) {
        int len = nums.length;
        int neg = 0;
        int z = 0;
        for(int i = 0;i< len;i++){
            if(nums[i]< 0) neg++;
            
            if(nums[i]== 0) z++;

            if(nums[i]> 0 )break;
        }
        return Math.max(neg,len - z-neg);
    }
}