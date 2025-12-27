class Solution {
    public int search(int[] nums, int target) {
        
        int len = nums.length;
        int left = 0;
        int right = len-1;
        int mid = 0;
        while(left <=right){

            mid =  left + (right-left)/2;

            if(nums[left] <= nums[mid]){
                
                if(nums[left]<= target && target <= nums[mid]){
                    if(nums[mid]== target)return mid;
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }
            else{
                if(nums[mid]<= target && target <= nums[right]){
                    if(nums[mid] == target)return mid;
                    left = mid+1;
                }
                else{
                    right = mid-1;
                }
            }
        }
        if(nums[mid] == target)return mid;
        return -1;
    }
}