class Solution {
    public int maxSubArray(int[] nums) {
        int sum =  0;
        int tempSum = -77689;
        for(int i = 0;i<nums.length;i++){
            sum += nums[i];
            tempSum = Math.max(sum,tempSum);
            if(sum < 0){
                sum = 0;
            }
        }
        return tempSum;
    }
}