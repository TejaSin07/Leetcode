class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int k = 0;
        for(int i = 2;i<n;i++){
            if(nums[i]!=nums[k]){
                nums[k+2] = nums[i];
                k++;
            }
            
        }
        return k+2;
    }
}