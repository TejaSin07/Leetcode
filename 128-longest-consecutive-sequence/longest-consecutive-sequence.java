class Solution {
    public int longestConsecutive(int[] nums) {
        //1st approch brute force done
        if(nums.length == 0  ) return 0;

        HashSet<Integer>numset = new HashSet<>();
        for (int num: nums){
            numset.add(num);
        } 
        int longestStreak = 0;
        for(int num: nums){
            if(!numset.contains(num-1)){
                int currentnum =  num;
                int currentstreak = 1;

                while(numset.contains(currentnum+1)){
                    currentstreak++;
                    currentnum++;
                }
                longestStreak = Math.max(longestStreak,currentstreak);
            }
        }
        return longestStreak;
    }
}