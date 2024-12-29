class Solution {
    public int findMin(int[] nums) {
        int right = nums.length-1;
        if(right ==0)return nums[0];
        int left = 0;
        
        while(left <= right ){
            int mid = (left + right )/2;
            int dava = left;
            int ujva = right;
            if(left == mid){
                dava = mid;
            }
            else{
                dava = mid-1;
            }
            if(right == mid){
                ujva = mid;
            }
            else{
                ujva = mid+1;
            }

            if(nums[mid] <= nums[dava]  && nums[mid] <= nums[ujva]){
                return nums[mid];
            }

            if(nums[left] < nums[right]){
                return nums[left];
            }
            else if(nums[left]>nums[mid]){
                right = mid-1;
            }
            else {
                left = mid+1;
            }


        }
        return -1;
    }
}