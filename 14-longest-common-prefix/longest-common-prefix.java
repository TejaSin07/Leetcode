class Solution {
    public String longestCommonPrefix(String[] strs) {
        // if(strs.length ==0) return "";
        Arrays.sort(strs);
        String s1 = strs[0];
        // if(s1.length()==0)return "";
        String s2 = strs[strs.length-1];
        int k = 0;
        for(int i = 0;i<s1.length();i++){
            if(s1.charAt(i)== s2.charAt(i)){
              k++;
            }
            else{
                break;
            }
        }
        return s1.substring(0, k); 
    }
}