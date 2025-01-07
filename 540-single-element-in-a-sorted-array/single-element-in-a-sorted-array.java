class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        if(right==0)return nums[0];
        while(left<=right){
            int mid = (left + right)/2;
            int len1 = 0;
            int len2 = 0 ;
            if((mid >left) && nums[mid]==nums[mid-1] ){
                len1 = (mid-1)-left;
                len2 = right - mid;

                if(len1%2!=0){
                    right = right -2;
            }
                else{
                    left = mid+1;
            }
            }
            else if((mid<right) && nums[mid]==nums[mid+1]){
                len1 =  mid-left;
                len2 = right -(mid+1);
                if(len1%2!=0){
                    right = right -1;
            }
                else{
                    left = mid+2;
            }
            }
            else{
                return nums[mid];
            }


        }
        return nums[right];
    }
}