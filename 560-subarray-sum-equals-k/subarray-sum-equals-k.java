class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int count = 0;
        int sum = 0;
        int len = nums.length;

        Map<Integer,Integer> map = new HashMap();
        map.put(sum,1);


        for(int i: nums){
            
            sum += i;
            if(map.containsKey(sum-k)){
                count += map.get(sum-k);
            }

            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}