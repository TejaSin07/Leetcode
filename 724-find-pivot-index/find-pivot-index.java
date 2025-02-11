class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int i : nums){
            sum+= i;
        }
        int leftSum = 0;
        for(int i = 0;i< nums.length;i++){
            if(i>0){
                leftSum += nums[i-1];
                sum = sum - nums[i-1]; 
            }
            if(leftSum == (sum - nums[i]) ){
                return i;
            }
        }
        return -1;
    }
}