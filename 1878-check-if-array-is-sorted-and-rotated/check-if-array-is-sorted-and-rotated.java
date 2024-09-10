class Solution {
    public boolean check(int[] nums) {
        int k = nums[0];
        int m = 0;
        for(int i =1;i<nums.length;i++){
            if(k > nums[i] ){
                m++;
            }
            k = nums[i];
        }
        if(m > 1 ){
            return false;
        }
        if(m == 1 && nums[0] < nums[nums.length-1]){
            return false;
        }
        return true;
    }
}