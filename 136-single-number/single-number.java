class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 0;

        while(i<nums.length){
            if(i == nums.length-1)return nums[i];
            if(nums[i] != nums[i+1])return nums[i];
            
            i = i+2;
        }
    return 0;
    }
}