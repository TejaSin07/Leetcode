class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int len = nums.length;
        if(len == 1)return nums;

        int [] ans = new int[len];
        for(int i = 0;i<len ;i++){

            if(nums[i] >=0){

                ans[i] = nums[(i+nums[i])%len];

            }
            else{
                
                if(Math.abs(nums[i]) <= i ){
                    ans[i] = nums[i+nums[i]];
                }
                else{
                    int cur = (i + nums[i])%len;

                    if(cur == 0)ans[i] = nums[0];
                    else{
                        ans[i] = nums[cur+len];
                    }
                   
                }
            }
        }
        return ans;
    }
}