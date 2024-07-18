class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int cur_jump ;
        int max_jump = 0;
        for(int i = 0;i<n;i++){
            if(max_jump == -1) return false;
            if (i == n-1) return true;
            
           
            cur_jump = nums[i];
            max_jump = Math.max(cur_jump,max_jump);
            max_jump--;
        }
        return false;
        
    }
}