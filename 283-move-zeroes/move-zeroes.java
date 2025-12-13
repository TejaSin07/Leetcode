class Solution {
    public void moveZeroes(int[] nums) {
        
        int left =  0;
        for(int i = 0;i< nums.length;i++){
            
            while( i < nums.length && nums[i] == 0 ){
                i++;
            }
            if(i < nums.length)nums[left++] = nums[i];

        }
         for(int i = left ; i <nums.length;i++){
            nums[i] = 0;
         }
    }
}