class Solution {
    public int longestBalanced(String s) {
        int max = 1;
    
        for(int i = 0;i<s.length();i++){
            int [] arr = new int[26];
            int freq = 0;
            for(int j = i;j<s.length();j++){
                arr[s.charAt(j)-'a']++;
                freq = arr[s.charAt(j)-'a'];
                if(isValid(i,j,s,arr,freq)){
                    max = Math.max(max,j-i+1);
                }
            }
        }
        return max;
    }

    private static boolean isValid(int start,int end ,String str,int [] arr,int freq){
        int len = str.length();

        for(int i = start;i<=end;i++){
            char ch = str.charAt(i);
            if(arr[ch -'a'] != freq){
                return false;
            }
        }
        return true;
    }
}