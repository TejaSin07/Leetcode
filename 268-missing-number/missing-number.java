class Solution {
    public int missingNumber(int[] nums) {
        int n= nums.length;
        int sum = 0;
        int sum2 = 0;
        int i = 0;
        while(i<n){
            sum += nums[i];
            i++;
        }
        sum2 = n*(n+1)/2;
        return sum2-sum;
    }
}