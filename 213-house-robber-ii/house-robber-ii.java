class Solution {
    public int rob(int[] nums) {
        
        int len = nums.length;
        Integer dp[] = new Integer[len];
        Integer dp2[] = new Integer[len];

        if(len <2)return nums[0];
        
        int first = helper(0,nums,dp,len-1);
        int second = helper(1,nums,dp2,len);


        return Math.max(first,second); 
    }


    private int helper(int ind ,int [] nums,Integer dp [] ,int len){

        if(ind > len-1)return 0;

        if(dp[ind] != null)return dp[ind];

        int take = nums[ind] + helper(ind+2,nums,dp,len);

        int notTake = helper(ind+1,nums,dp,len);

        return dp[ind]= Math.max(take,notTake);

    }
}