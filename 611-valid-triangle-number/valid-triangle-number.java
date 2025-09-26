class Solution {
    public int triangleNumber(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        int ans = 0;
        for(int i=0;i<len-2;i++){
            for(int j = i+1;j<len-1;j++){
                int sum = nums[i]+nums[j];
                if(sum -1  >= nums[j+1]){
                    ans += helper(j+1,len-1,sum-1,nums);
                }
            }
        }
        return ans;
    }


    private static int helper(int left,int right,int ele,int[] nums){
        int temp = left;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid] > ele){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return right - temp + 1 ;
    }
}