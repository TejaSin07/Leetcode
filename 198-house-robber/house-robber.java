class Solution {
    public int rob(int[] nums) {
        int  n = nums.length;
        int [] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = -1;
        }
        return dp(n-1,arr,nums);
    }
    public  int dp(int ind,int [] arr,int [] nums){
        if(ind<0) return 0;
        if(ind == 0 ) return nums[0];

        if(arr[ind] != -1) return arr[ind];

        int pick = nums[ind] +  dp(ind-2,arr,nums);
        int notpick =  dp(ind-1,arr,nums);

        arr[ind] = Math.max(pick,notpick);
        return arr[ind];
    }
}