class Solution {
    public int rob(int[] nums) {
        
        int len = nums.length;
        Integer [] dp = new Integer[len];

        if(len <=1)return nums[0];
        return Math.max(helper(0,nums,dp),helper(1,nums,dp));
    
    }


    private int helper(int ind,int [] nums,Integer dp[]){

        int len = nums.length;
        if(ind == nums.length-1)return nums[ind];


        if(dp[ind] != null)return dp[ind];

        int first = 0;
        int second = 0;

        if(ind+2 < len){
            first = helper(ind+2,nums,dp);
        }
        if(ind+3 < len ){
            second = helper(ind+3,nums,dp);
        }

        return dp[ind] = Math.max(first,second) + nums[ind];
    }
}