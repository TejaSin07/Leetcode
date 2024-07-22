class Solution {
    public int jump(int[] nums) {

        int current_end = 0;
        int farthest = 0;
        int jump = 0;

        if(nums.length == 1){
            return 0;
        }

        for(int i = 0;i<nums.length;i++){
            farthest = Math.max(farthest,i+nums[i]);

            if(i == current_end){
                jump++;
                current_end = farthest;
                if(current_end >= nums.length-1){
                    break;
                }
            }

        } return jump;
    }
}