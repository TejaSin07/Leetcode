class Solution {
    public void sortColors(int[] nums) {
        int n = 0;
        int m = 0;
        for(int i = 0;i< nums.length;i++){
            if(nums[i] == 0){
                n++;
            }
            else if(nums[i]==1){
                m++;
            }
        }
        int o = nums.length-m-n;
        int k = 0;
        while(n>0){
            nums[k] = 0;
            k++;
            n--;
        }
        while(m>0){
            nums[k] = 1;
            k++;
            m--;
        }
        while(o>0){
            nums[k] = 2;
            k++;
            o--;
        }
    }
}