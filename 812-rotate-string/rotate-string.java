class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length())return false;
        int i = 0;
        int j = 0;
        int count=0;
        int n= goal.length() + goal.length();
        while(i<n){
            int k = i%goal.length();  
            if(j<s.length() && goal.charAt(k) == s.charAt(j)){
                count++;
                j++;
            }
            else{
                if (count > 0) {
                    i -= count; // Roll back to check for partial matches
                }
                count =0;
                j=0;
                
            }
            if(count == goal.length()){
                return true;
            }
            i++;

        }
        return false;
    }
}