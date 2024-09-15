class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer>preSum = new HashMap<>();
        int result = 0;
        int sum = 0;
        preSum.put(0,1);
        for(int i = 0;i<nums.length;i++){
            sum += nums[i];
            if(preSum.containsKey(sum-k)){
                result += preSum.get(sum-k);
            }

            if(preSum.containsKey(sum)){
                preSum.put(sum,preSum.get(sum)+1);
            }
            else{
                preSum.put(sum,1);
            }
        }
        return result;
    }
}