class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        for(int i = 0;i<s.length();i++){
            HashMap<Character,Integer> map = new HashMap<>();
            int length = 0;
            int j = i;
            while(j<s.length() && !map.containsKey(s.charAt(j))){
                length++;
                map.put(s.charAt(j),j);
                j++;
            }
            maxLength = Math.max(length,maxLength);
        }
        return maxLength;
    }
}