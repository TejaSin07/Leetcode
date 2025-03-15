class Solution {
    public int minCapability(int[] nums, int k) {
        int left = 99999999;
        int right = 0;
        
        for(int i: nums){
            left= Math.min(left ,i);
            right = Math.max(right,i);
        }
        int ans = right;
        while(left <= right){
            int mid = (left + right)/2;
            if(validOrNot(nums, mid, k)){
                ans = mid;
                right = mid-1;
            }
            else{
                left = mid+1;
            }

        }
        return ans;
    }

    public boolean validOrNot( int nums[],int ind,int k){
        int cap = ind;
        int i = 0;
        int count =0;
        while(i < nums.length){
            if(nums[i] <= cap){
                count++;
                i=i+2;
            }
            else{
                i ++;
            }
            if(count == k ) return true;
        }
        return false;
    }
}