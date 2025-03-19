class Solution {
    public int minOperations(int[] nums) {
        int result = -1;
        int sum1=0;
        for(int temp: nums){
            sum1 += temp;
        }
        if(sum1 == nums.length) return 0;

        for(int i = 0;i< nums.length-2;i++){

            if(nums[i]==1)continue;
            int count = 0;
            result++;
            for(int j = i;j<nums.length;j++){
                
                count++;
                nums[j] ^= 1;
                if(count==3)break;
            }
        }
        int sum = 0;
        for(int temp: nums){
            sum += temp;
        }

        if(sum != nums.length) return -1;
        if(result == -1)return result;
        return result+1;

      
    }
}