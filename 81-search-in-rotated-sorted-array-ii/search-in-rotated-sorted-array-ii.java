class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            int mid = (left + right)/2;

            if(nums[mid]== target){
                return true;
            }
            if(nums[mid]== nums[left]){
                left++;

            }
            else if(nums[mid] == nums[right]){
                right --;
            }
            else if(nums[mid]<nums[right]){
                if(target>nums[mid] && target<= nums[right]){
                    left = mid+1;
                }
                else{
                    right = mid-1;
                }
            } 
            else{
                if(target<nums[mid] && target>= nums[left]){
                    right = mid-1;
                }
                else if(nums[left] == nums[mid]){
                    left = left+1;
                }

                else{
                    left = mid+1;
                }

            }
        }
        return false;
    }
}