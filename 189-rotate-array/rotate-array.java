class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(0,nums.length-1,nums);
        reverse(0,k-1,nums);
        reverse(k,nums.length-1,nums);

    }

    public void reverse(int start,int end,int [] arr){
        while(start < end){
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }
}