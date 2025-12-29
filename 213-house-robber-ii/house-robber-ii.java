class Solution {
    public int rob(int[] nums) {
        
        int len = nums.length;
        Integer dp[] = new Integer[len];
        Integer dp2[] = new Integer[len];

        if(len <2)return nums[0];
        
        int first = helper(0,nums,len-1);
        int second = helper(1,nums,len);


        return Math.max(first,second); 
    }


    private int helper(int ind ,int [] nums,int len){

        int prev2 = 0;
        int prev = nums[ind];
        

        for(int i = ind+1;i<len;i++){

            int cur = Math.max(nums[i] + prev2,prev);
            prev2 = prev;
            prev = cur;

        }
        return Math.max(prev2,prev);

    }
}