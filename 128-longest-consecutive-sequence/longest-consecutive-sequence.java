class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int currSeq = 0;
        int maxSeq = 0;
        if(nums.length < 1) return 0;
        for(int i = 1;i<nums.length;i++){
            if(nums[i-1]==nums[i]) continue;
            if(nums[i-1]+1==nums[i]){
                currSeq += 1;
            }
            else{
            maxSeq = Math.max(currSeq+1,maxSeq);
            currSeq = 0;   
        }
        }
        maxSeq = Math.max(currSeq+1,maxSeq);
        return maxSeq;
    }
}