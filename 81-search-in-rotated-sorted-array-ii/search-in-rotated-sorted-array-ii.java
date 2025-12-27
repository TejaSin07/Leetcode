class Solution {
    public boolean search(int[] nums, int target) {
        
        int len = nums.length;
        int left = 0;
        int right = len-1;

        while(left <= right){

            

            while(left < right && nums[left] == nums[left+1] )left++;
            while(right > left &&  nums[right] == nums[right-1])right--;
            int mid = left + (right -left)/2;
            if(nums[mid] == target)return true;
            
              if(nums[left] <= nums[mid]){
                
                if(nums[left]<= target && target <= nums[mid]){
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }
            else{
                if(nums[mid]<= target && target <= nums[right]){
                    left = mid+1;
                }
                else{
                    right = mid-1;
                }
            }
        }
        return false;
    }
}