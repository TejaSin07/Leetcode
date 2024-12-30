class Solution {
    public int findPeakElement(int[] nums) {
        int left =0;
        int right= nums.length-1;
        int  dava = left;
        int ujva = right;
        if (right == 0) return right;
        if(nums[right]>nums[right-1]) return right;
        if(nums[left]>nums[left +1]) return left;
        while(left <= right){

            int mid = (left+ right)/2;
            if(mid == left){
                dava = left;
            }
            else{
                dava = mid-1;
            }
            if(mid == right){
                ujva = right;
            }
            else{
                ujva = mid+1;
            }
            if(nums[mid]>=nums[dava] && nums[mid]>= nums[ujva]){
                return mid;
            }

            else if(nums[mid]< nums[right]){
                left = mid+1;
            }
            else{
                right = right -1;
            }
        }
        return -1;
    }
}