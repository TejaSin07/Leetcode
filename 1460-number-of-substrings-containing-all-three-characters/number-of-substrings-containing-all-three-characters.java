class Solution {
    public int numberOfSubstrings(String s) {
        int count = 0;
        int left = 0;
        int len = s.length();

        int chars[] = new int[3];

        for(int right = 0;right <len;right ++){
            chars[s.charAt(right) -'a']++;

            while(chars[0]>0 && chars[1]>0 && chars[2]>0 ){
                count += len - right;
                chars[s.charAt(left) -'a']--;
                left++;
            }
        }
        return count;
    }
}