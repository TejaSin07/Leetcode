class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int [] arr = new int [n];

        if(n==1) return nums[0];

        for(int i = 0;i< n;i++){
            arr[i] = -1;
        }
        int A = helper(n-1,arr,nums,1);
        for(int i = 0;i< n;i++){
            arr[i] = -1;
        }
        int b = helper(n-2,arr,nums,0);

        return Math.max(A,b);
    }

    public int helper(int n,int [] arr,int[] nums,int end){
        if(n == end) return nums[n];
        if(n < end) return 0;
        if(arr[n] != -1) return arr[n];

        int pick = nums[n] +  helper(n-2,arr,nums,end);
        int notpick =  helper(n-1,arr,nums,end);

        arr[n] = Math.max(pick,notpick);
        return arr[n];
    }
}