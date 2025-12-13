class Solution {
    public void sortColors(int[] nums) {
        int mid = 0;
        int low = 0;
        int high = nums.length-1;

        while(high >= mid){

            if(nums[mid] == 0){
                int temp = nums[mid];
                nums[mid++] = nums[low];
                nums[low++] = temp;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                int temp = nums[high];
                nums[high--] = nums[mid];
                nums[mid] = temp;
            }
        }


    }
}