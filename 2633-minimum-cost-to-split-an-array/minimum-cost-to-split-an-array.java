class Solution {
    public int minCost(int[] nums, int k) {
        
        int len = nums.length;
        Integer[] dp = new Integer[len];

        return helper(0,nums,k,dp);
    }


    private static int helper(int idx,int [] nums,int k ,Integer [] dp){

        if(idx == nums.length)return 0;

        if(dp[idx] != null)return dp[idx];

        int [] freq = new int[nums.length+1];
        int ans = Integer.MAX_VALUE;
        int trimedLen = 0;
        for(int i = idx;i<nums.length;i++){
            int val = nums[i];
            freq[val]++;

            if(freq[val] == 2){
                trimedLen += 2;
            }
            if(freq[val] > 2){
                trimedLen += 1;
            }

            ans = Math.min(k+trimedLen+helper(i+1,nums,k,dp),ans);
        }
        return dp[idx] = ans;
    }
}