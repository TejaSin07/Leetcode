class Solution {
    public int maxProfit(int[] nums) {
        int profit = 0;
        
        int x = 0;

        for(int i = 0;i<nums.length;i++){

            if(nums[i]>nums[x]){
                profit += (nums[i] -nums[x]); 
            }
            x = i;
        }

        return profit;
        
    }
}