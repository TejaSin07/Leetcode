class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        
        int len = nums.size();
        if(k==1)return true;
        
        for(int i = 0;i<len;i++){
            int set = 0;
            int ele = 1;

            for(int j= i+1;j< (k*2)+i && j < len;j++){
                if(nums.get(j-1) < nums.get(j)){
                    ele++;
                }
                
                if(ele == k){
                    ele = 1;
                    set++;
                    j++;
                }
            }

            if(set == 2)return true;

        }
        return false;
    }
}