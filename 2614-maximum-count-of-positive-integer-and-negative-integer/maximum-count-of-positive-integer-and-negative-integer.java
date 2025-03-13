class Solution {
    public int maximumCount(int[] nums) {
        int ngc = binsearch(nums,0);
        int ptc = nums.length-binsearch(nums,1);
        return Math.max(ngc,ptc);
    }

    public int binsearch(int [] nums,int target){
        int left = 0;
        int right = nums.length-1;
        int result = nums.length;

        while(left <= right){
            int mid = (left + right)/2;
            if(nums[mid] < target){
                left = mid+1;
            }
            else{
                result = mid;
                right = mid-1;
            }
        }
        return result;
    }
}