class Solution {
    public int rob(int[] nums) {
        
        
        int end = nums.length-1;
        if(end == 0)return nums[0];
        int fromFirst = rob(0,end-1,nums); 
        int fromSecond = rob(1,end,nums);

        return Math.max(fromFirst,fromSecond);
    }

    private  int rob(int idx,int last,int [] nums){
        int prev =nums[idx];
        int sprev = 0;
        for(int i = idx+1;i<=last;i++){
            
        
            int pick = nums[i] + sprev;
            int notpick = prev;
        
            int cur = Math.max(pick,notpick);

            sprev = prev;
            prev = cur;
        }

        return prev;
    }
}