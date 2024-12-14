class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> ans = new HashSet<>();
        for(int num:nums){
            ans.add(num);
        }
        int cur = 0;
        int max = 0;
        for(int num : nums){
            if(!ans.contains(num-1)){
                while(ans.contains(num+1)){
                    cur++;
                    num++;

                }
                max = Math.max(cur+1,max);
                cur = 0;
            }
        }
        return max;
    }
}