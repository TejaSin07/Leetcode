class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = -219897;
        for(int i = 0;i<nums.length;i++){
            sum += nums[i];
            maxSum = Math.max(maxSum,sum);

            if(sum<0){
                sum = 0;
            }
        }
        return maxSum;
    }
}