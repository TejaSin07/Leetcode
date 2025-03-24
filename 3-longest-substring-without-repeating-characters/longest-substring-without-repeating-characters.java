class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int start = 0;
        int res = 0;
        int [] arr = new int [128];
        for(int end = 0;end<len;end++){
            start = Math.max(start,arr[s.charAt(end)]);
            
            arr[s.charAt(end)] = end+1;
            
            res = Math.max(res,end-start+1);
        }
        return res;
    }
}