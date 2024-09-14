class Solution {
    public void nextPermutation(int[] nums) {
        //2,1,4,3,6,1 try this example to understand
        int i = nums.length-2;
        while(i>=0 && nums[i]>= nums[i+1]){
            i--;
        }
        if(i>=0){
            int j = nums.length - 1;
            while(nums[i]>= nums[j]){
                j--;
            } 
            swap(nums,i,j);
        }
        reverse(nums,i+1,nums.length-1);
    }
    private  static void swap(int[] nums,int i,int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
    }
    private  static void reverse(int[] nums,int start ,int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            end--;
            start++; 
        }
}
}