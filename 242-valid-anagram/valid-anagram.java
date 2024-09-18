class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())return false;
        int map1[] = new int[200];
        int map2[] = new int[200];

        for(int i= 0;i<s.length();i++){
            map1[s.charAt(i)] += 1;
            map2[t.charAt(i)] += 1;
        }
        for(int i = 0;i<s.length();i++){
            if(map1[s.charAt(i)]!= map2[s.charAt(i)]) return false;
        }
        return true;

    }
}