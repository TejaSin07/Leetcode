 class Solution {
    public boolean isSubsequence(String s, String t) {
        int lenA = s.length();
        int lenB = t.length();
        int slow = 0;
        int fast = 0;
        while(slow<lenA){  
             if(fast == lenB){
                return false;
            }
            char first = s.charAt(slow);
            char second = t.charAt(fast);
            if(first != second){
                fast++;
            }
            else{
                slow++;
                fast++;
            }

         
        }return true;
    }
}