class Solution {
    public boolean isTrionic(int[] nums) {
        int ups = 0;
        int downs = 0;
        boolean upside = false;
        boolean downside = true;
        int len = nums.length;

        if((nums[1] -nums[0]) < 0  )return false;
        // if((nums[len-1] -nums[len-2]) > 0  )return false;

        for(int i = 1;i<len;i++ ){

            if(nums[i]==nums[i-1])return false;

            if(!upside && (nums[i] -nums[i-1]) > 0 ){
                ups++;
                upside = true;
                downside = false;
            }
            else if( !downside && (nums[i] -nums[i-1]) < 0){
                downside = true;
                upside = false;
                downs++;
            }
            else{

            }
        }

        if(ups ==2 && downs == 1)return true;
        return false;
    }
}