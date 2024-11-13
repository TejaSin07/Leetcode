class Solution {
    public int missingNumber(int[] nums) {
     Arrays.sort(nums);
     int i = 1;
     while(i< nums.length){
        if(nums[i-1]+1 == nums[i]){
            i++;
            continue;
            
        }
        else{
            return nums[i-1]+1;
        }
     }
     if(nums.length == nums[nums.length-1]){
        return 0;
     }
     return nums.length;   
    }
}