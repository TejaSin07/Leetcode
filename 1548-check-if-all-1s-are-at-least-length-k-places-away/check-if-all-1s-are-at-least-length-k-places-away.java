class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int m = 0;
        boolean first = true;
        for(int i : nums){
            if(i == 1){
                if(m < k && !first)return false;
                first = false;
                m = 0;
            }
            else{
                m++;
            }
        }        
        return true;
    }
}