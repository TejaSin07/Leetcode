class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Map<Character,Integer> map = new HashMap<>();

        int prev = 0;
        int maxLen = 0;
        for(int cur = 0;cur<s.length();cur++){

            char ch = s.charAt(cur);
            map.put(ch,map.getOrDefault(ch,0)+1);

            while(map.get(ch) > 1){
                map.put(s.charAt(prev),map.getOrDefault(s.charAt(prev),0)-1);
                prev++;
            }
            maxLen = Math.max(maxLen,cur-prev+1);
        }

        return maxLen;
    }
}