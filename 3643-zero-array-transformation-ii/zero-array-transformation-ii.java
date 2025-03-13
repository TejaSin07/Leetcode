class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        int len = nums.length;
        if(nums[0] ==0 && nums[len-1] == 500000) return -1;
        int diff[] = new int[len+1];
        int sol = 0;//1
        int jmla = 0;
        int count = 0;

        for(int i : nums){
            if(i==0)count++;
        }
        if(count == len)return 0;
        
        for(int[] que: queries){
            diff[que[0]] -= que[2];   //diff=[-2,0,0,+2]
            diff[que[1] + 1] += que[2]; 
            
            int d = 0;
            for(int i = 0;i< len;i++){
                d += diff[i];//0,1,2
                if(d+nums[i]> 0){
                    sol++;
                    break;
                }
                if(i == len-1) {
                    jmla = 1;
                    break;
                }
            }

            if(jmla > 0) break;
        }
        if(jmla > 0) return sol+1;
        return -1;

    }
}