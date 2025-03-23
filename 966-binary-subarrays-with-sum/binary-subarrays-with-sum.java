class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int[] arr = new int[2];//[0th pos,1st pos]
        int start = 0;
        int countLoops = 0;
        while(start < 2 ){
            int left = 0;
            int sum = 0;
            for(int right = 0;right< nums.length;right++){
                sum += nums[right];

                while(sum>goal && left <= right){
                    sum -= nums[left];
                    left++;
                }
                if(sum <= goal){
                    arr[start] +=  right - left +1;
                }
            }
            if(goal == 0 && countLoops==0) return arr[0];
            goal--;
            countLoops++;
            start++;
        }
       
        return arr[0]-arr[1];
    }
}