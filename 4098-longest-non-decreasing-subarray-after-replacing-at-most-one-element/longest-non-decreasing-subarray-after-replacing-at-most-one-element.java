class Solution {
    public int longestSubarray(int[] nums) {
        
        int len = nums.length;
        int [] left = new int[len];
        int [] right = new int [len];

        Arrays.fill(left,1);
        Arrays.fill(right,1);

        int maxLen = 0;

        for(int i = 1;i<len;i++){

            if(nums[i] >= nums[i-1]){
                left[i] = left[i-1]+1;
            }
            maxLen = Math.max(left[i],maxLen);
        }
        maxLen = Math.min(len,maxLen+1);
        
        for(int i = len-2;i>=0;i--){
            if(nums[i] <= nums[i+1]){
                right[i] = right[i+1]+1;
            }
        }

        for(int i = 1;i<len-1;i++){
            if(nums[i-1] <= nums[i+1]){
                maxLen = Math.max(maxLen,left[i-1]+right[i+1]+1);
            }
        }
        return maxLen;
    }
}