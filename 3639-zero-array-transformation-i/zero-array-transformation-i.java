class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int len = nums.length;
        int diff[] = new int [len+1];

        for(int que[] : queries){
            diff[que[0]]--;
            diff[que[1]+1]++;
        }

        int dif = 0;

        for(int i = 0;i< len;i++){
            dif += diff[i];
            if(dif + nums[i] > 0)return false;
        }
        return true;
    }
}