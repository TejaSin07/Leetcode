class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() !=t.length())return false;
        int [] ar = new int [128];
        int [] kr = new int[128];
        for(int i = 0;i<s.length();i++){
            ar[s.charAt(i)] += 1;
            kr[t.charAt(i)] += 1;
        }
        for(int i = 0;i<s.length();i++){
            if(ar[s.charAt(i)] != kr[s.charAt(i)]){
                    return false;
            }
            
        }
        return  true;

    }
}