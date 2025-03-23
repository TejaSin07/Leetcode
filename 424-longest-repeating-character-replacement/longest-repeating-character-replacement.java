class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int mlen  = 0;
        int  freq =  0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int right = 0;right < s.length();right++){
            char x = s.charAt(right);
            map.put(x, map.getOrDefault(x , 0) + 1);
            freq = Math.max(freq,map.get(x));
            while((right - left + 1 - freq) > k){
                map.put(s.charAt(left), map.getOrDefault(s.charAt(left) , 0) -1);
                left++;
            }
            mlen = Math.max(right-left+1,mlen);
        }
        return mlen;
    }
}