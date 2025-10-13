class Solution {
    public String longestPalindrome(String s) {
        int max = 0;
        int start = 0;
        int end = 0;
        for(int i = 0;i<s.length();i++){
            int single = paliLen(i,i,s);
            int two = paliLen(i,i+1,s);
            max = Math.max(single,two); 
            if(max > end - start){
              start = i - (max -1)/2;
              end = max/2 +i ; 
           }
        }
        return s.substring(start,end+1);
    }

    private static int paliLen(int left,int right,String s){

        while(left >=0 && right <s.length()){
            if(s.charAt(left) != s.charAt(right))break;
            left--;
            right++;
        }
        return right-left-1;
    }
}