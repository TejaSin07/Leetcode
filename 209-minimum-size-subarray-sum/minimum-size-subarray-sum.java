class Solution {
    public int minSubArrayLen(int target, int[] nums) {
    int sum  = 0;
    int min_sub = Integer.MAX_VALUE;
    int i = 0;

    for(int j =0;j<nums.length;j++){
        sum += nums[j];
        while(sum >= target){
            min_sub = Math.min(min_sub,j-i+1);
            sum -= nums[i];
            i++;
        }

       }
       return min_sub == Integer.MAX_VALUE ? 0:min_sub;
     }
    }