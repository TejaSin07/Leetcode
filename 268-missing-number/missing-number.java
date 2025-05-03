class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int sum = len;
        int originalSum = 0;
        for(int i = 0;i<len;i++){
            sum += i;
            originalSum += nums[i];
        }
        return sum -originalSum; 
    }
}