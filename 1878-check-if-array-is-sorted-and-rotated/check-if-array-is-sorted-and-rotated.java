class Solution {
    public boolean check(int[] nums) {
       int k = 0;
       for(int i = 0;i < nums.length-1;i++ ) {
        if(nums[i+1] >= nums[i]){
            continue;
        }
        else{
            k++;
            if(k>1){
                return false;
            }

        }
       }
       if(k == 0){
        return true;
       }

       if(k==1){
        if(nums[0] >= nums[nums.length-1]){
            return true;
        }
        else{
            return false;
        }
       }
       return true;
    }
}
