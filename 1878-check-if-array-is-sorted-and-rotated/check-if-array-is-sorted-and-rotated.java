class Solution {
    public boolean check(int[] nums) {
        int len = nums.length;
        int rotationCount = 0 ;

        for(int i = 0;i<len;i++){
            if(nums[i] <= nums[(i+1)%len]){
                continue;
            }
            else{
                rotationCount++;
            }
        }
        if(rotationCount > 1)return false;
        return true;
    }
}