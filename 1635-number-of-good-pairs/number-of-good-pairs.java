class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        int count = 0;
        int len = nums.length;

        for(int i = 0;i<len;i++){

            int cur = nums[i];
            count += (int)Arrays.stream(nums).skip(i).filter(a -> a == cur).count() -1;

        }
        return count;
    }
}