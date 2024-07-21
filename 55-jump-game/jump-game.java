class Solution {
    public boolean canJump(int[] nums) {
        int max_jump = 0;
        for (int i=0;i<nums.length;i++){
            if(max_jump == -1) return false;

            max_jump = Math.max(max_jump,nums[i]);
           
            if (max_jump >= nums.length-i-1 ){
                return true;
            }
            
            
             max_jump--;
            
        }
        return false;
    }
}