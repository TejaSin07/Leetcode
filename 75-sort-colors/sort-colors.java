class Solution {
    public void sortColors(int[] nums) {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for(int i : nums){
            if(i == 1)count1++;
            if(i == 2)count2++;
            if(i == 0)count3++;
        }
        for(int i = 0;i<nums.length;i++){
            if(count3 != 0){
                nums[i] = 0;
                count3--;
            }
            else if(count1 != 0){
                nums[i] = 1;
                count1--;
            }
            else{
                nums[i] = 2;
                count2--;
            }
        }
    }
}