class Solution {
    public int rob(int[] nums) {
        
        int len = nums.length ;

        Integer dp[] = new Integer[len];

        for(int i = 0;i<len;i++){

            int one = 0;
            int two = 0;

            if(i-2 >=0)one = dp[i-2];
            if(i-3 >=0)two =  dp[i-3];

            dp[i] = Math.max(one,two) + nums[i];
        }

        if(len >1)return Math.max(dp[len-1],dp[len-2]);
        return dp[len-1];
    }
}