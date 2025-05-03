class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> charSet = new HashSet<>();
        int left = 0;
        int len = 0;
        char [] ch = s.toCharArray();
        for(int right = 0;right <ch.length;right++){
            while(charSet.contains(ch[right])){
                charSet.remove(ch[left]);
                left++;
            }
            charSet.add(ch[right]);
            len = Math.max(len,right-left+1);
        }
        return len;
    }
}