class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 2,j =2;
        int  n = nums.length;
        if (n <= 2) return n;
        while(j<n){
            if(nums[j] != nums[i-2]){
                nums[i] = nums[j];
                i++;
            }
            j++;
        }
        return i;
        
    }
}